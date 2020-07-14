package by.epamtc.selector.entity;

import java.util.Objects;

public class VacuumCleaner implements Appliance {
    private String powerConsumption;
    private String filterType;
    private String bagType;
    private String wandtype;
    private String motorSpeedRegulation;
    private String cleaningWidth;

    @Override
    public String toString() {
        return "VacuumCleaner{" +
                "powerConsumption='" + powerConsumption + '\'' +
                ", filterType='" + filterType + '\'' +
                ", bagType='" + bagType + '\'' +
                ", wandtype='" + wandtype + '\'' +
                ", motorSpeedRegulation='" + motorSpeedRegulation + '\'' +
                ", cleaningWidth='" + cleaningWidth + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VacuumCleaner that = (VacuumCleaner) o;
        return Objects.equals(powerConsumption, that.powerConsumption) &&
                Objects.equals(filterType, that.filterType) &&
                Objects.equals(bagType, that.bagType) &&
                Objects.equals(wandtype, that.wandtype) &&
                Objects.equals(motorSpeedRegulation, that.motorSpeedRegulation) &&
                Objects.equals(cleaningWidth, that.cleaningWidth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(powerConsumption, filterType, bagType, wandtype, motorSpeedRegulation, cleaningWidth);
    }

    public void setPowerConsumption(String powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public void setFilterType(String filterType) {
        this.filterType = filterType;
    }

    public void setBagType(String bagType) {
        this.bagType = bagType;
    }

    public void setWandtype(String wandtype) {
        this.wandtype = wandtype;
    }

    public void setMotorSpeedRegulation(String motorSpeedRegulation) {
        this.motorSpeedRegulation = motorSpeedRegulation;
    }

    public void setCleaningWidth(String cleaningWidth) {
        this.cleaningWidth = cleaningWidth;
    }
}
