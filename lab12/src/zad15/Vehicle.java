package zad15;

public class Vehicle implements Comparable<Vehicle>{
    private String model;
    private int speed;

    public Vehicle(String model, int speed) {
        this.model = model;
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "model='" + model + '\'' +
                ", speed=" + speed +
                '}';
    }

    @Override
    public int compareTo(Vehicle o) {
        return Integer.compare(this.speed, o.speed);
    }
}
