import java.util.Map;

public class Oven extends Product {
    private String TYPE;
    private String POWER_CONSUMPTION;
    private String WEIGHT;
    private String CAPACITY;
    private String DEPTH;
    private String HEIGHT;
    private String WIDTH;

    public Oven(Map<String, String> parameters) {
        TYPE = parameters.get("TYPE");
        POWER_CONSUMPTION = parameters.get("POWER_CONSUMPTION");
        WEIGHT = parameters.get("WEIGHT");
        CAPACITY = parameters.get("CAPACITY");
        DEPTH = parameters.get("DEPTH");
        HEIGHT = parameters.get("HEIGHT");
        WIDTH = parameters.get("WIDTH");
    }

    @Override
    public String toString() {
        return "Oven{" +
                "TYPE='" + TYPE + '\'' +
                ", POWER_CONSUMPTION='" + POWER_CONSUMPTION + '\'' +
                ", WEIGHT='" + WEIGHT + '\'' +
                ", CAPACITY='" + CAPACITY + '\'' +
                ", DEPTH='" + DEPTH + '\'' +
                ", HEIGHT='" + HEIGHT + '\'' +
                ", WIDTH='" + WIDTH + '\'' +
                '}';
    }
}
