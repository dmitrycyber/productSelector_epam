import java.util.Map;

public class TabletPC extends Product {
    private String TYPE;
    private String BATTERY_CAPACITY;
    private String DISPLAY_INCHES;
    private String MEMORY_ROM;
    private String FLASH_MEMORY_CAPACITY;
    private String COLOR;

    public TabletPC(Map<String, String> parameters) {
        TYPE = parameters.get("TYPE");
        BATTERY_CAPACITY = parameters.get("BATTERY_CAPACITY");
        DISPLAY_INCHES = parameters.get("DISPLAY_INCHES");
        MEMORY_ROM = parameters.get("MEMORY_ROM");
        FLASH_MEMORY_CAPACITY = parameters.get("FLASH_MEMORY_CAPACITY");
        COLOR = parameters.get("COLOR");
    }

    @Override
    public String toString() {
        return "TabletPC{" +
                "TYPE='" + TYPE + '\'' +
                ", BATTERY_CAPACITY='" + BATTERY_CAPACITY + '\'' +
                ", DISPLAY_INCHES='" + DISPLAY_INCHES + '\'' +
                ", MEMORY_ROM='" + MEMORY_ROM + '\'' +
                ", FLASH_MEMORY_CAPACITY='" + FLASH_MEMORY_CAPACITY + '\'' +
                ", COLOR='" + COLOR + '\'' +
                '}';
    }
}
