import java.util.Map;

public class Speakers extends Product {
    private String TYPE;
    private String POWER_CONSUMPTION;
    private String NUMBER_OF_SPEAKERS;
    private String FREQUENCY_RANGE;
    private String CORD_LENGTH;

    public Speakers(Map<String, String> parameters) {
        TYPE = parameters.get("TYPE");
        POWER_CONSUMPTION = parameters.get("POWER_CONSUMPTION");
        NUMBER_OF_SPEAKERS = parameters.get("NUMBER_OF_SPEAKERS");
        FREQUENCY_RANGE = parameters.get("FREQUENCY_RANGE");
        CORD_LENGTH = parameters.get("CORD_LENGTH");
    }

    @Override
    public String toString() {
        return "Speakers{" +
                "TYPE='" + TYPE + '\'' +
                ", POWER_CONSUMPTION='" + POWER_CONSUMPTION + '\'' +
                ", NUMBER_OF_SPEAKERS='" + NUMBER_OF_SPEAKERS + '\'' +
                ", FREQUENCY_RANGE='" + FREQUENCY_RANGE + '\'' +
                ", CORD_LENGTH='" + CORD_LENGTH + '\'' +
                '}';
    }
}
