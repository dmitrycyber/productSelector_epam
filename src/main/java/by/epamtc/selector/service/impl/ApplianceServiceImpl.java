package by.epamtc.selector.service.impl;


import by.epamtc.selector.dao.ApplianceDAO;
import by.epamtc.selector.dao.DAOFactory;
import by.epamtc.selector.entity.Appliance;
import by.epamtc.selector.entity.Laptop;
import by.epamtc.selector.entity.criteria.Criteria;
import by.epamtc.selector.service.ApplianceService;
import by.epamtc.selector.service.validation.Validator;

import java.util.List;

public class ApplianceServiceImpl implements ApplianceService {

	@Override
	public List<Appliance> find(Criteria criteria) {
		if (!Validator.criteriaValidator(criteria)) {
			return null;
		}
		
		DAOFactory factory = DAOFactory.getInstance();
		ApplianceDAO applianceDAO = factory.getApplianceDAO();

		List<Appliance> applianceList = applianceDAO.find(criteria);

		return applianceList;
	}

}

