package by.epamtc.divoninsky.selector.entity;

import java.util.Objects;

public class Oven implements Appliance {
    private String powerConsumption;
    private String weight;
    private String capacity;
    private String depth;
    private String height;
    private String width;

    public String getPowerConsumption() {
        return powerConsumption;
    }

    public String getWeight() {
        return weight;
    }

    public String getCapacity() {
        return capacity;
    }

    public String getDepth() {
        return depth;
    }

    public String getHeight() {
        return height;
    }

    public String getWidth() {
        return width;
    }

    @Override
    public String toString() {
        return "Oven{" +
                "powerConsumption='" + powerConsumption + '\'' +
                ", weight='" + weight + '\'' +
                ", capacity='" + capacity + '\'' +
                ", depth='" + depth + '\'' +
                ", height='" + height + '\'' +
                ", width='" + width + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Oven oven = (Oven) o;
        return Objects.equals(powerConsumption, oven.powerConsumption) &&
                Objects.equals(weight, oven.weight) &&
                Objects.equals(capacity, oven.capacity) &&
                Objects.equals(depth, oven.depth) &&
                Objects.equals(height, oven.height) &&
                Objects.equals(width, oven.width);
    }

    @Override
    public int hashCode() {
        return Objects.hash(powerConsumption, weight, capacity, depth, height, width);
    }

    public void setPowerConsumption(String powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    public void setDepth(String depth) {
        this.depth = depth;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public void setWidth(String width) {
        this.width = width;
    }
}
