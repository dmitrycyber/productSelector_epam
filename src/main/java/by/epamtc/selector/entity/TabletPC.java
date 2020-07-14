package by.epamtc.selector.entity;

import java.util.Objects;

public class TabletPC implements Appliance {
    private String batteryCapacity;
    private String displayInches;
    private String memoryRom;
    private String flashMemoryCapacity;
    private String color;

    @Override
    public String toString() {
        return "TabletPC{" +
                "batteryCapacity='" + batteryCapacity + '\'' +
                ", displayInches='" + displayInches + '\'' +
                ", memoryRom='" + memoryRom + '\'' +
                ", flashMemoryCapacity='" + flashMemoryCapacity + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TabletPC tabletPC = (TabletPC) o;
        return Objects.equals(batteryCapacity, tabletPC.batteryCapacity) &&
                Objects.equals(displayInches, tabletPC.displayInches) &&
                Objects.equals(memoryRom, tabletPC.memoryRom) &&
                Objects.equals(flashMemoryCapacity, tabletPC.flashMemoryCapacity) &&
                Objects.equals(color, tabletPC.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(batteryCapacity, displayInches, memoryRom, flashMemoryCapacity, color);
    }

    public void setBatteryCapacity(String batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public void setDisplayInches(String displayInches) {
        this.displayInches = displayInches;
    }

    public void setMemoryRom(String memoryRom) {
        this.memoryRom = memoryRom;
    }

    public void setFlashMemoryCapacity(String flashMemoryCapacity) {
        this.flashMemoryCapacity = flashMemoryCapacity;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
