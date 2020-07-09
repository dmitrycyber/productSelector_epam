package by.epamtc.productSelector.entity;

import java.util.Map;
import java.util.Objects;

public class Refrigerator implements Product {
    private String powerConsumption;
    private String weight;
    private String freezerCapacity;
    private String overallCapacity;
    private String height;
    private String width;

    @Override
    public String toString() {
        return "Refrigerator{" +
                "powerConsumption='" + powerConsumption + '\'' +
                ", weight='" + weight + '\'' +
                ", freezerCapacity='" + freezerCapacity + '\'' +
                ", overallCapacity='" + overallCapacity + '\'' +
                ", height='" + height + '\'' +
                ", width='" + width + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Refrigerator that = (Refrigerator) o;
        return Objects.equals(powerConsumption, that.powerConsumption) &&
                Objects.equals(weight, that.weight) &&
                Objects.equals(freezerCapacity, that.freezerCapacity) &&
                Objects.equals(overallCapacity, that.overallCapacity) &&
                Objects.equals(height, that.height) &&
                Objects.equals(width, that.width);
    }

    @Override
    public int hashCode() {
        return Objects.hash(powerConsumption, weight, freezerCapacity, overallCapacity, height, width);
    }

    public void setPowerConsumption(String powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public void setFreezerCapacity(String freezerCapacity) {
        this.freezerCapacity = freezerCapacity;
    }

    public void setOverallCapacity(String overallCapacity) {
        this.overallCapacity = overallCapacity;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public void setWidth(String width) {
        this.width = width;
    }
}
