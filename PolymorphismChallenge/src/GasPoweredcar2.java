public class GasPoweredcar2 extends Car{
    private double avgKmPerLitre;
    private int cylinders;
    public GasPoweredcar2(String description, double avgKmPerLitre, int cylinders) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
    }

}
