import java.util.Map;

public class VacuumCleaner extends Product {
    private String TYPE;
    private String POWER_CONSUMPTION;
    private String FILTER_TYPE;
    private String BAG_TYPE;
    private String WAND_TYPE;
    private String MOTOR_SPEED_REGULATION;
    private String CLEANING_WIDTH;

    public VacuumCleaner(Map<String, String> parameters) {
        TYPE = parameters.get("TYPE");
        POWER_CONSUMPTION = parameters.get("POWER_CONSUMPTION");
        FILTER_TYPE = parameters.get("FILTER_TYPE");
        BAG_TYPE = parameters.get("BAG_TYPE");
        WAND_TYPE = parameters.get("WAND_TYPE");
        MOTOR_SPEED_REGULATION = parameters.get("MOTOR_SPEED_REGULATION");
        CLEANING_WIDTH = parameters.get("CLEANING_WIDTH");
    }

    @Override
    public String toString() {
        return "VacuumCleaner{" +
                "TYPE='" + TYPE + '\'' +
                ", POWER_CONSUMPTION='" + POWER_CONSUMPTION + '\'' +
                ", FILTER_TYPE='" + FILTER_TYPE + '\'' +
                ", BAG_TYPE='" + BAG_TYPE + '\'' +
                ", WAND_TYPE='" + WAND_TYPE + '\'' +
                ", MOTOR_SPEED_REGULATION='" + MOTOR_SPEED_REGULATION + '\'' +
                ", CLEANING_WIDTH='" + CLEANING_WIDTH + '\'' +
                '}';
    }
}
