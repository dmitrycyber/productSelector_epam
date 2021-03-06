package by.epamtc.divoninsky.selector.dao.creator;

import by.epamtc.divoninsky.selector.entity.Laptop;
import by.epamtc.divoninsky.selector.entity.Appliance;

import java.util.Map;

public class LaptopCreator implements ApplianceCreator {

    @Override
    public Appliance create(Map<String, String> parameters) {
        Laptop laptop = new Laptop();
        laptop.setBatteryCapacity(parameters.get("BATTERY_CAPACITY"));
        laptop.setOs(parameters.get("OS"));
        laptop.setMemoryRom(parameters.get("MEMORY_ROM"));
        laptop.setSystemMemory(parameters.get("SYSTEM_MEMORY"));
        laptop.setCpu(parameters.get("CPU"));
        laptop.setDisplayInches(parameters.get("DISPLAY_INCHS"));
        return laptop;
    }
}
