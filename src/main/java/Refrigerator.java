import java.util.Map;

public class Refrigerator extends Product {
    private String TYPE;
    private String POWER_CONSUMPTION;
    private String WEIGHT;
    private String FREEZER_CAPACITY;
    private String OVERALL_CAPACITY;
    private String HEIGHT;
    private String WIDTH;

    public Refrigerator(Map<String,String> parameters) {
        TYPE = parameters.get("TYPE");
        POWER_CONSUMPTION = parameters.get("POWER_CONSUMPTION");
        WEIGHT = parameters.get("WEIGHT");
        FREEZER_CAPACITY = parameters.get("FREEZER_CAPACITY");
        OVERALL_CAPACITY = parameters.get("OVERALL_CAPACITY");
        HEIGHT = parameters.get("HEIGHT");
        WIDTH = parameters.get("WIDTH");
    }

    @Override
    public String toString() {
        return "Refrigerator{" +
                "TYPE='" + TYPE + '\'' +
                ", POWER_CONSUMPTION='" + POWER_CONSUMPTION + '\'' +
                ", WEIGHT='" + WEIGHT + '\'' +
                ", FREEZER_CAPACITY='" + FREEZER_CAPACITY + '\'' +
                ", OVERALL_CAPACITY='" + OVERALL_CAPACITY + '\'' +
                ", HEIGHT='" + HEIGHT + '\'' +
                ", WIDTH='" + WIDTH + '\'' +
                '}';
    }
}
