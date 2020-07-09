package by.epamtc.selector.services.creator;

import by.epamtc.selector.entity.Product;
import by.epamtc.selector.entity.Refrigerator;

import java.util.Map;

public class RefrigeratorCreator implements ProductCreator {
    @Override
    public Product create(Map<String, String> parameters) {
        Refrigerator refrigerator = new Refrigerator();
        refrigerator.setPowerConsumption(parameters.get("POWER_CONSUMPTION"));
        refrigerator.setWeight(parameters.get("WEIGHT"));
        refrigerator.setFreezerCapacity(parameters.get("FREEZER_CAPACITY"));
        refrigerator.setOverallCapacity(parameters.get("OVERALL_CAPACITY"));
        refrigerator.setHeight(parameters.get("HEIGHT"));
        refrigerator.setWidth(parameters.get("WIDTH"));
        return refrigerator;
    }
}
