package by.epamtc.divoninsky.selector.main;


import by.epamtc.divoninsky.selector.entity.*;

import java.util.List;

public class PrintApplianceInfo {

    public static void print(List<Appliance> appliancelist) {
        for (int i = 0; i < appliancelist.size(); i++) {
            Appliance appliance = appliancelist.get(i);
            System.out.println((i + 1) + ". " + appliance.getClass().getSimpleName());
            if (appliance instanceof Laptop) {
                printLaptop(appliance);
            }
            if (appliance instanceof Oven) {
                printOven(appliance);
            }
            if (appliance instanceof Refrigerator) {
                printRefrigerator(appliance);
            }
            if (appliance instanceof Speakers) {
                printSpeakers(appliance);
            }
            if (appliance instanceof TabletPC) {
                printTabletPc(appliance);
            }
            if (appliance instanceof VacuumCleaner) {
                printVacuumCleaner(appliance);
            }
        }
    }

    private static void printLaptop(Appliance appliance) {
        Laptop laptop = (Laptop) appliance;
        System.out.println("Battery Capacity: " + laptop.getBatteryCapacity());
        System.out.println("Cpu: " + laptop.getCpu());
        System.out.println("Display Inches: " + laptop.getDisplayInches());
        System.out.println("Memory Rom: " + laptop.getMemoryRom());
        System.out.println("Os: " + laptop.getOs());
        System.out.println("System Memory: " + laptop.getSystemMemory());
    }

    private static void printOven(Appliance appliance) {
        Oven oven = (Oven) appliance;
        System.out.println("Capacity: " + oven.getCapacity());
        System.out.println("Depth: " + oven.getDepth());
        System.out.println("Height: " + oven.getHeight());
        System.out.println("Power Consumption: " + oven.getPowerConsumption());
        System.out.println("Weight: " + oven.getWeight());
        System.out.println("Width: " + oven.getWidth());
    }

    private static void printRefrigerator(Appliance appliance) {
        Refrigerator refrigerator = (Refrigerator) appliance;
        System.out.println("Height: " + refrigerator.getHeight());
        System.out.println("Power Consumption: " + refrigerator.getPowerConsumption());
        System.out.println("Weight: " + refrigerator.getWeight());
        System.out.println("Width: " + refrigerator.getWidth());
        System.out.println("Freezer Capacity: " + refrigerator.getFreezerCapacity());
        System.out.println("Overall Capacity: " + refrigerator.getOverallCapacity());
    }

    private static void printSpeakers(Appliance appliance) {
        Speakers speakers = (Speakers) appliance;
        System.out.println("Power Consumption: " + speakers.getPowerConsumption());
        System.out.println("Cord Length: " + speakers.getCordLength());
        System.out.println("Frequency Range: " + speakers.getFrequencyRange());
        System.out.println("Number Of Speakers: " + speakers.getNumberOfSpeakers());
    }

    private static void printTabletPc(Appliance appliance) {
        TabletPC tabletPC = (TabletPC) appliance;
        System.out.println("Battery Capacity: " + tabletPC.getBatteryCapacity());
        System.out.println("Display Inches: " + tabletPC.getDisplayInches());
        System.out.println("Memory Rom: " + tabletPC.getMemoryRom());
        System.out.println("Color: " + tabletPC.getColor());
        System.out.println("Flash Memory Capacity: " + tabletPC.getFlashMemoryCapacity());
    }

    private static void printVacuumCleaner(Appliance appliance) {
        VacuumCleaner vacuumCleaner = (VacuumCleaner) appliance;
        System.out.println("Power Consumption: " + vacuumCleaner.getPowerConsumption());
        System.out.println("Bag Type: " + vacuumCleaner.getBagType());
        System.out.println("CleaningWidth: " + vacuumCleaner.getCleaningWidth());
        System.out.println("FilterType: " + vacuumCleaner.getFilterType());
        System.out.println("Motor Speed Regulation: " + vacuumCleaner.getMotorSpeedRegulation());
        System.out.println("Wand type: " + vacuumCleaner.getWandtype());
    }


}
