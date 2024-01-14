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

    public void setTime(double time, int index){
        this.times = times.clone();
        if(index >= 0 && index < times.length){
            times[index] = time;
        }
        else throw new IllegalArgumentException("Index beyond limit");

    }
    @Override
    public String toString() {
        return "Athlete{" +
                "name='" + name + '\'' +
                ", times=" + Arrays.toString(times) +
                '}';
    }

    @Override
    public Athlete clone(){
        try{
            Athlete athlete = (Athlete) super.clone();
            athlete.times = this.times.clone();
            return athlete;
        }catch(CloneNotSupportedException e){
            e.printStackTrace();
            return null;
        }

    }
}
