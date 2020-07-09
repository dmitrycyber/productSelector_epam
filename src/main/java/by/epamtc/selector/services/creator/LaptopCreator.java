package by.epamtc.selector.services.creator;

import by.epamtc.selector.entity.Laptop;
import by.epamtc.selector.entity.Product;

import java.util.Map;

public class LaptopCreator implements ProductCreator {

    @Override
    public Product create(Map<String, String> parameters) {
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
