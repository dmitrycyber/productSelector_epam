package by.epamtc.selector.service;


import by.epamtc.selector.entity.Appliance;
import by.epamtc.selector.entity.criteria.Criteria;

import java.util.List;

public interface ApplianceService {
	
	List<Appliance> find(Criteria criteria);
	
}
