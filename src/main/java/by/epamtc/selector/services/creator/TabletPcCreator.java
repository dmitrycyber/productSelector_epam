package by.epamtc.selector.services.creator;

import by.epamtc.selector.entity.Product;
import by.epamtc.selector.entity.TabletPC;

import java.util.Map;

public class TabletPcCreator implements ProductCreator {
    @Override
    public Product create(Map<String, String> parameters) {
        TabletPC tabletPC = new TabletPC();
        tabletPC.setBatteryCapacity(parameters.get("BATTERY_CAPACITY"));
        tabletPC.setDisplayInches(parameters.get("DISPLAY_INCHES"));
        tabletPC.setMemoryRom(parameters.get("MEMORY_ROM"));
        tabletPC.setFlashMemoryCapacity(parameters.get("FLASH_MEMORY_CAPACITY"));
        tabletPC.setColor(parameters.get("COLOR"));
        return tabletPC;
    }
}
