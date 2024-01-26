package tourism;

public class Hotel implements Cloneable{
    private String name;
    private double capacity;

    public Hotel(String name, double capacity) {
        this.name = name == null ? "" : name;
        this.capacity = capacity <= 0 ? 50.0 : capacity;
    }

    public void setName(String name) {
        if(name != null){
            this.name = name;
        }
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "name='" + name + '\'' +
                ", capacity=" + capacity +
                '}';
    }

    @Override
    public Hotel clone() throws CloneNotSupportedException {
        return (Hotel) super.clone();
    }
}
