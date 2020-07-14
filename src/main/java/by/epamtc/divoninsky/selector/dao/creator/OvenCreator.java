package by.epamtc.divoninsky.selector.dao.creator;

import by.epamtc.divoninsky.selector.entity.Oven;
import by.epamtc.divoninsky.selector.entity.Appliance;

import java.util.Map;

public class OvenCreator implements ApplianceCreator {
    @Override
    public Appliance create(Map<String, String> parameters) {
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
