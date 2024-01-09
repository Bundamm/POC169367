package sports;

import java.util.Arrays;

public class Athlete implements Cloneable{
    private String name;
    private double[] times;

    public Athlete(String name, double[] times) {
        this.name = name;
        this.times = times;
    }

    public String getName() {
        return name;
    }

    public double[] getTimes() {
        return times;
    }

    @Override
    public String toString() {
        return "Athlete{" +
                "name='" + name + '\'' +
                ", times=" + Arrays.toString(times) +
                '}';
    }

    @Override
    public Athlete clone() throws CloneNotSupportedException {
        return (Athlete) super.clone();
    }
}
