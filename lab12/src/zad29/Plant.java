package zad29;

public class Plant implements Comparable<Plant>{
    private String name;

    public Plant(String name) {
        this.name = name;
    }
    @Override
    public int compareTo(Plant o) {
        return 0;
    }
}
