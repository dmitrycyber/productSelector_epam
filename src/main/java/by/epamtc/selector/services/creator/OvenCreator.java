package by.epamtc.selector.services.creator;

import by.epamtc.selector.entity.Oven;
import by.epamtc.selector.entity.Product;

import java.util.Map;

public class OvenCreator implements ProductCreator {
    @Override
    public Product create(Map<String, String> parameters) {
        Oven oven = new Oven();
        oven.setPowerConsumption(parameters.get("POWER_CONSUMPTION"));
        oven.setWeight(parameters.get("WEIGHT"));
        oven.setCapacity(parameters.get("CAPACITY"));
        oven.setDepth(parameters.get("DEPTH"));
        oven.setHeight(parameters.get("HEIGHT"));
        oven.setWidth(parameters.get("WIDTH"));
        return oven;
    }
}