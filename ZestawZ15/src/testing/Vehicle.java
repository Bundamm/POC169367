package testing;

import java.util.Objects;

public class Vehicle {
    private String model;
    private double speed;

    public Vehicle(String model, double speed) {
        this.model = model;
        this.speed = speed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Vehicle vehicle = (Vehicle) o;

        if (Double.compare(speed, vehicle.speed) != 0) return false;
        return Objects.equals(model, vehicle.model);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = model != null ? model.hashCode() : 0;
        temp = Double.doubleToLongBits(speed);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
