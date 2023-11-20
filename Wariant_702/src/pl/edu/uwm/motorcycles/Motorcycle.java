package pl.edu.uwm.motorcycles;

public class Motorcycle {
    private String brand;
    private int yearOfProduction;
    private double fuelConsumption;

    public Motorcycle(String brand, int yearOfProduction, double fuelConsumption) {
        this.brand = brand;
        this.yearOfProduction = yearOfProduction;
        this.fuelConsumption = fuelConsumption;
    }

    @Override
    public String toString() {
        if(brand.isEmpty() || brand == null){
            return "Motocykl. Rok prod.: " + yearOfProduction + ", zużycie: " + fuelConsumption + "l/100km.";
        }
        return "Motocykl. " +
                "Marka: " + brand + ", " +
                "rok prod.: " + yearOfProduction +
                ", zużycie: " + fuelConsumption +
                "l/100km.";
    }
}