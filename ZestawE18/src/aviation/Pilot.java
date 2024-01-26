package aviation;

import java.util.Arrays;

public class Pilot implements Cloneable{
    private String name;
    private double[] flightHours;

    public Pilot(String name, double[] flightHours) {
        this.name = name;
        this.flightHours = flightHours == null ? new double[0] : flightHours.clone();
    }

    public void changeHour(int index, double hour){
        if(index > flightHours.length-1){
            throw new IllegalArgumentException("nah");
        }
        double[] temp = flightHours.clone();
        temp[index] = hour;
        flightHours = temp;
    }
    @Override
    public String toString() {
        return "Pilot{" +
                "name='" + name + '\'' +
                ", flightHours=" + Arrays.toString(flightHours) +
                '}';
    }

    @Override
    public Pilot clone() throws CloneNotSupportedException {
        Pilot temp = (Pilot) super.clone();
        temp.flightHours = flightHours.clone();
        return temp;
    }
}
