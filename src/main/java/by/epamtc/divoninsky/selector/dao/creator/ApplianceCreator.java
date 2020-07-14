package by.epamtc.divoninsky.selector.dao.creator;

import by.epamtc.divoninsky.selector.entity.Appliance;

import java.util.Map;

public interface ApplianceCreator {
    Appliance create(Map<String, String> parameters);
}
