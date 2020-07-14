package by.epamtc.selector.dao;


import by.epamtc.selector.entity.Appliance;
import by.epamtc.selector.entity.criteria.Criteria;

import java.util.List;


public interface ApplianceDAO {
	List<Appliance> find(Criteria criteria);
}
