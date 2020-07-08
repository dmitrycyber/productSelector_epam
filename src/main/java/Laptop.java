import java.util.Map;

public class Laptop extends Product {
    private String TYPE;
    private String BATTERY_CAPACITY;
    private String OS;
    private String MEMORY_ROM;
    private String SYSTEM_MEMORY;
    private String CPU;
    private String DISPLAY_INCHS;

    public Laptop(Map<String, String> parameters) {
        TYPE = parameters.get("TYPE");
        BATTERY_CAPACITY = parameters.get("BATTERY_CAPACITY");
        OS = parameters.get("OS");
        MEMORY_ROM = parameters.get("MEMORY_ROM");
        SYSTEM_MEMORY = parameters.get("SYSTEM_MEMORY");
        CPU = parameters.get("CPU");
        DISPLAY_INCHS = parameters.get("DISPLAY_INCHS");
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "TYPE='" + TYPE + '\'' +
                ", BATTERY_CAPACITY='" + BATTERY_CAPACITY + '\'' +
                ", OS='" + OS + '\'' +
                ", MEMORY_ROM='" + MEMORY_ROM + '\'' +
                ", SYSTEM_MEMORY='" + SYSTEM_MEMORY + '\'' +
                ", CPU='" + CPU + '\'' +
                ", DISPLAY_INCHS='" + DISPLAY_INCHS + '\'' +
                '}';
    }
}
