package by.epamtc.selector.services.creator;

import java.util.HashMap;
import java.util.Map;

public class CreatorsContainer {
    private Map<String, ProductCreator> creatorMap = new HashMap<>();

    public CreatorsContainer() {
        creatorMap.put("Laptop", new LaptopCreator());
        creatorMap.put("Oven", new OvenCreator());
        creatorMap.put("Refrigerator", new RefrigeratorCreator());
        creatorMap.put("VacuumCleaner", new VacuumCleanerCreator());
        creatorMap.put("TabletPC", new TabletPcCreator());
        creatorMap.put("Speakers", new SpeakersCreator());
    }

    public Map<String, ProductCreator> getCreatorMap() {
        return creatorMap;
    }
}
