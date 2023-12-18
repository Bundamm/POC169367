package transport;

public class Vehicle implements Comparable<Vehicle>{
    private String model;
    private double speed;
    private double fuelConsumption;

    public Vehicle(String model, double speed, double fuelConsumption) {
        this.model = model;
        this.speed = speed;
        this.fuelConsumption = fuelConsumption;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "model='" + model + '\'' +
                ", speed=" + speed +
                ", fuelConsumption=" + fuelConsumption +
                '}';
    }

    @Override
    public int compareTo(Vehicle obj) {
        return Double.compare(this.fuelConsumption, obj.fuelConsumption);
    }
}
