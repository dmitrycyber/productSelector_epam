public class TabletPC extends Product {
    private String BATTERY_CAPACITY;
    private String DISPLAY_INCHES;
    private String MEMORY_ROM;
    private String FLASH_MEMORY_CAPACITY;
    private String COLOR;

    public void setBATTERY_CAPACITY(String BATTERY_CAPACITY) {
        this.BATTERY_CAPACITY = BATTERY_CAPACITY;
    }

    public void setDISPLAY_INCHES(String DISPLAY_INCHES) {
        this.DISPLAY_INCHES = DISPLAY_INCHES;
    }

    public void setMEMORY_ROM(String MEMORY_ROM) {
        this.MEMORY_ROM = MEMORY_ROM;
    }

    public void setFLASH_MEMORY_CAPACITY(String FLASH_MEMORY_CAPACITY) {
        this.FLASH_MEMORY_CAPACITY = FLASH_MEMORY_CAPACITY;
    }

    public void setCOLOR(String COLOR) {
        this.COLOR = COLOR;
    }

    @Override
    public String toString() {
        return "TabletPC{" +
                "BATTERY_CAPACITY='" + BATTERY_CAPACITY + '\'' +
                ", DISPLAY_INCHES='" + DISPLAY_INCHES + '\'' +
                ", MEMORY_ROM='" + MEMORY_ROM + '\'' +
                ", FLASH_MEMORY_CAPACITY='" + FLASH_MEMORY_CAPACITY + '\'' +
                ", COLOR='" + COLOR + '\'' +
                '}';
    }
}
