package by.epamtc.selector.models;

public class UserRequestModel {
    private String  type;
    private String  property;
    private String value;

    public UserRequestModel(String type, String property, String value) {
        this.type = type;
        this.property = property;
        this.value = value;
    }

    public String getType() {
        return type;
    }

    public String getProperty() {
        return property;
    }

    public String getValue() {
        return value;
    }
}
