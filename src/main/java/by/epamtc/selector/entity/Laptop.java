package by.epamtc.selector.entity;

import java.util.Map;
import java.util.Objects;

public class Laptop implements Appliance {
    private String batteryCapacity;
    private String os;
    private String memoryRom;
    private String systemMemory;
    private String cpu;
    private String displayInches;

    public Laptop() {
    }

    public Laptop(Map<String, String> parameters) {
        batteryCapacity = parameters.get("BATTERY_CAPACITY");
        os = parameters.get("OS");
        memoryRom = parameters.get("MEMORY_ROM");
        systemMemory = parameters.get("SYSTEM_MEMORY");
        cpu = parameters.get("CPU");
        displayInches = parameters.get("DISPLAY_INCHS");
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "batteryCapacity='" + batteryCapacity + '\'' +
                ", os='" + os + '\'' +
                ", memoryRom='" + memoryRom + '\'' +
                ", systemMemory='" + systemMemory + '\'' +
                ", cpu='" + cpu + '\'' +
                ", displayInches='" + displayInches + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Laptop laptop = (Laptop) o;
        return Objects.equals(batteryCapacity, laptop.batteryCapacity) &&
                Objects.equals(os, laptop.os) &&
                Objects.equals(memoryRom, laptop.memoryRom) &&
                Objects.equals(systemMemory, laptop.systemMemory) &&
                Objects.equals(cpu, laptop.cpu) &&
                Objects.equals(displayInches, laptop.displayInches);
    }

    @Override
    public int hashCode() {
        return Objects.hash(batteryCapacity, os, memoryRom, systemMemory, cpu, displayInches);
    }


    public void setBatteryCapacity(String batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public void setMemoryRom(String memoryRom) {
        this.memoryRom = memoryRom;
    }

    public void setSystemMemory(String systemMemory) {
        this.systemMemory = systemMemory;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public void setDisplayInches(String displayInches) {
        this.displayInches = displayInches;
    }
}
