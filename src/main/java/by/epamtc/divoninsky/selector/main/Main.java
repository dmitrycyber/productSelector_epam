package by.epamtc.divoninsky.selector.main;


import by.epamtc.divoninsky.selector.entity.criteria.Criteria;
import by.epamtc.divoninsky.selector.entity.criteria.SearchCriteria;
import by.epamtc.divoninsky.selector.service.ApplianceService;
import by.epamtc.divoninsky.selector.service.ServiceFactory;
import by.epamtc.divoninsky.selector.entity.Appliance;
import by.epamtc.divoninsky.selector.entity.Oven;

import java.util.List;

public class Main {

	public static void main(String[] args) {

		ServiceFactory factory = ServiceFactory.getInstance();
		ApplianceService service = factory.getApplianceService();

		//////////////////////////////////////////////////////////////////

		Criteria criteriaOven = new Criteria(Oven.class.getSimpleName());//"Oven"
		criteriaOven.add(SearchCriteria.Oven.CAPACITY.toString(), 32);

		List<Appliance> applianceList = service.find(criteriaOven);

		System.out.println(applianceList);

//		PrintApplianceInfo.print(appliance);

		//////////////////////////////////////////////////////////////////

//		criteriaOven = new Criteria(Oven.class.getSimpleName());
//		criteriaOven.add(SearchCriteria.Oven.HEIGHT.toString(), 200);
//		criteriaOven.add(SearchCriteria.Oven.DEPTH.toString(), 300);
//
//		appliance = service.find(criteriaOven);
//
//		PrintApplianceInfo.print(appliance);
//
//		//////////////////////////////////////////////////////////////////
//
//		Criteria criteriaTabletPC = new Criteria(TabletPC.class.getSimpleName());
//		criteriaTabletPC.add(SearchCriteria.TabletPC.COLOR.toString(), "BLUE");
//		criteriaTabletPC.add(SearchCriteria.TabletPC.DISPLAY_INCHES.toString(), 14);
//		criteriaTabletPC.add(SearchCriteria.TabletPC.MEMORY_ROM.toString(), 4);
//
//		appliance = service.find(criteriaOven);// find(Object...obj)
//
//		PrintApplianceInfo.print(appliance);

	}

}
