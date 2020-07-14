package by.epamtc.divoninsky.selector.service;


import by.epamtc.divoninsky.selector.entity.criteria.Criteria;
import by.epamtc.divoninsky.selector.entity.Appliance;

import java.util.List;

public interface ApplianceService {
	
	List<Appliance> find(Criteria criteria);
	
}
