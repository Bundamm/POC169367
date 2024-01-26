package aviation;

import java.util.ArrayList;

public class Pilot implements Cloneable{
    private String name;
    private ArrayList<Double> flightHours;

    public Pilot(String name, ArrayList<Double> flightHours) {
        this.name = name;
        this.flightHours = flightHours == null ? new ArrayList<>() : new ArrayList<>(flightHours);
    }

    public void changeHour(Double hour, int index){
        flightHours.set(index, hour);
    }


    @Override
    public String toString() {
        return "Pilot{" +
                "name='" + name + '\'' +
                ", flightHours=" + flightHours +
                '}';
    }

    @Override
    public Pilot clone() {
        try {
            Pilot clone = (Pilot) super.clone();
            clone.flightHours = new ArrayList<>(flightHours);
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
