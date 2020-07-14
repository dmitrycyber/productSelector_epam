package by.epamtc.selector.dao.creator;

import by.epamtc.selector.entity.Appliance;
import by.epamtc.selector.entity.VacuumCleaner;

import java.util.Map;

public class VacuumCleanerCreator implements ProductCreator {
    @Override
    public Appliance create(Map<String, String> parameters) {
        VacuumCleaner vacuumCleaner = new VacuumCleaner();
        vacuumCleaner.setPowerConsumption(parameters.get("POWER_CONSUMPTION"));
        vacuumCleaner.setFilterType(parameters.get("FILTER_TYPE"));
        vacuumCleaner.setBagType(parameters.get("BAG_TYPE"));
        vacuumCleaner.setWandtype(parameters.get("WAND_TYPE"));
        vacuumCleaner.setMotorSpeedRegulation(parameters.get("MOTOR_SPEED_REGULATION"));
        vacuumCleaner.setCleaningWidth(parameters.get("CLEANING_WIDTH"));
        return vacuumCleaner;
    }
}
