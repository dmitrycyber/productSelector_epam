package by.epamtc.divoninsky.selector.dao;


import by.epamtc.divoninsky.selector.entity.Appliance;
import by.epamtc.divoninsky.selector.entity.criteria.Criteria;

import java.util.List;


public interface ApplianceDAO {
	List<Appliance> find(Criteria criteria);
}
