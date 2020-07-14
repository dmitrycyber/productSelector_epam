package by.epamtc.selector.dao.creator;

import by.epamtc.selector.entity.Appliance;

import java.util.Map;

public interface ApplianceCreator {
    Appliance create(Map<String, String> parameters);
}
