package healthcare;

public class Hospital {
    private String name;
    private double capacity;

    public Hospital(String name, double capacity) {
        this.name = name == null ? "" : name;
        this.capacity = capacity <= 0 ? 50.0 : capacity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name != null){
            this.name = name;
        }
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity <= 0 ? 50.0 : capacity;
    }

    @Override
    public String toString() {
        if(name != ""){
            return getClass().getSimpleName() + ": Name: "+name+". Capacity: "+capacity+".";
        }
        return getClass().getSimpleName() + ": Capacity: "+capacity+".";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Hospital hospital = (Hospital) o;

        if (Double.compare(capacity, hospital.capacity) != 0) return false;
        return name.equals(hospital.name);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name.hashCode();
        temp = Double.doubleToLongBits(capacity);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
