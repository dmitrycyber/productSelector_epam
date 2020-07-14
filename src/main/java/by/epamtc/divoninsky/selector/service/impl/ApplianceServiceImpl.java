package by.epamtc.divoninsky.selector.service.impl;


import by.epamtc.divoninsky.selector.dao.ApplianceDAO;
import by.epamtc.divoninsky.selector.dao.DAOFactory;
import by.epamtc.divoninsky.selector.entity.criteria.Criteria;
import by.epamtc.divoninsky.selector.service.ApplianceService;
import by.epamtc.divoninsky.selector.service.validation.Validator;
import by.epamtc.divoninsky.selector.entity.Appliance;

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

