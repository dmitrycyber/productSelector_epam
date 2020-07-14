package by.epamtc.divoninsky.selector.dao.creator;

import java.util.HashMap;
import java.util.Map;

public class CreatorsContainer {
    private static CreatorsContainer instance = new CreatorsContainer();
    private Map<String, ApplianceCreator> creatorMap = new HashMap<>();

    private CreatorsContainer() {
        creatorMap.put("Laptop", new LaptopCreator());
        creatorMap.put("Oven", new OvenCreator());
        creatorMap.put("Refrigerator", new RefrigeratorCreator());
        creatorMap.put("VacuumCleaner", new VacuumCleanerCreator());
        creatorMap.put("TabletPC", new TabletPcCreator());
        creatorMap.put("Speakers", new SpeakersCreator());
    }

    public Map<String, ApplianceCreator> getCreatorMap() {
        return creatorMap;
    }

    public static CreatorsContainer getInstance() {
        return instance;
    }
}
