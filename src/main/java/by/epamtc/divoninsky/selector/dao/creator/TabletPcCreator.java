package by.epamtc.divoninsky.selector.dao.creator;

import by.epamtc.divoninsky.selector.entity.Appliance;
import by.epamtc.divoninsky.selector.entity.TabletPC;

import java.util.Map;

public class TabletPcCreator implements ApplianceCreator {
    @Override
    public Appliance create(Map<String, String> parameters) {
        TabletPC tabletPC = new TabletPC();
        tabletPC.setBatteryCapacity(parameters.get("BATTERY_CAPACITY"));
        tabletPC.setDisplayInches(parameters.get("DISPLAY_INCHES"));
        tabletPC.setMemoryRom(parameters.get("MEMORY_ROM"));
        tabletPC.setFlashMemoryCapacity(parameters.get("FLASH_MEMORY_CAPACITY"));
        tabletPC.setColor(parameters.get("COLOR"));
        return tabletPC;
    }
}
