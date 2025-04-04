package healthcare;

public class Hospital implements Cloneable{
    private String name;
    private double capacity;

    public Hospital(String name, double capacity) {
        this.name = (name == null) ? "" : name;
        this.capacity = (capacity <= 0) ? 50 : capacity;
    }

    @Override
    public String toString() {
        return "Hospital{" +
                "name='" + name + '\'' +
                ", capacity=" + capacity +
                '}';
    }

    @Override
    public Hospital clone() throws CloneNotSupportedException {
        return (Hospital) super.clone();
    }
}
