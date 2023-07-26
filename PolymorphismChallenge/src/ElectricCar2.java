public class ElectricCar2 extends Car{
    private double avgKmPercharge;
    private int batterySize;

    public ElectricCar2(String description, double avgKmPercharge, int batterySize) {
        super(description);
        this.avgKmPercharge = avgKmPercharge;
        this.batterySize = batterySize;
    }
}
