package by.epamtc.selector.dao.impl;

import by.epamtc.selector.dao.ApplianceDAO;
import by.epamtc.selector.dao.creator.CreatorsContainer;
import by.epamtc.selector.entity.Appliance;
import by.epamtc.selector.entity.criteria.Criteria;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ApplianceDAOImpl implements ApplianceDAO {
    private final String FILE_NAME = "appliances_db.txt";


    public List<Appliance> find(Criteria criteria) {
        try (Reader reader = new FileReader(getClass().getClassLoader().getResource(FILE_NAME).getPath());
             BufferedReader bufferedReader = new BufferedReader(reader)) {
			List<Appliance> applianceList = bufferedReader.lines()
					.filter(line -> line.startsWith(criteria.getGroupSearchName()))
					.filter(line -> hasCriteria(criteria, line))
					.map(line -> line.replaceAll(" ", ""))
					.map(line -> line.replaceAll(criteria.getGroupSearchName() + ":", ""))
					.map(line -> line.replaceAll(";", ""))
					.map(line -> params(line))
					.map(line -> CreatorsContainer.getInstance().getCreatorMap().get(criteria.getGroupSearchName()).create(line))
					.collect(Collectors.toList());
			return applianceList;

        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
        return null;
    }

    private boolean hasCriteria(Criteria criteria, String line){
		for (Map.Entry<String, Object> entry : criteria.getCriteria().entrySet()) {
			if (!line.contains(entry.getKey() + "=" + entry.getValue())){
				return false;
			}
		}
		return true;
	}

	private Map<String, String> params (String line){
		Map<String, String> parametersOfProduct = new HashMap<>();
		String[] split = line.split(",");

		for (int j = 0; j < split.length; j++) {
			String[] split1 = split[j].split("=");

			for (int k = 0; k < split1.length; k++) {
				parametersOfProduct.put(split1[0], split1[1]);
			}
		}
		return parametersOfProduct;
	}


}
