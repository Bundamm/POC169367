package sports;

import java.util.Arrays;

public class Athlete {
    private String name;
    private String nationality;
    private double[] records;

    public Athlete(String name, String nationality, double[] records) {
        this.name = name;
        this.nationality = nationality;
        this.records = records == null ? new double[0] : records.clone();
    }

    public String getName() {
        return name;
    }

    public String getNationality() {
        return nationality;
    }

    public double[] getRecords() {
        return records.clone();
    }

    @Override
    public String toString() {
        return "Athlete{" +
                "name='" + name + '\'' +
                ", nationality='" + nationality + '\'' +
                ", records=" + Arrays.toString(records) +
                '}';
    }
}
