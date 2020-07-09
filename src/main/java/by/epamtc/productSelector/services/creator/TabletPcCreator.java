package by.epamtc.productSelector.services.creator;

import by.epamtc.productSelector.entity.Product;
import by.epamtc.productSelector.entity.TabletPC;

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
