package transport;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Objects;

public class BusStation {
    private String name;
    private String city;
    private ArrayList<String> buses;

    public BusStation(String name, String city, ArrayList<String> buses) {
        this.name = name;
        this.city = city;
        this.buses = buses == null ? new ArrayList<>() : new ArrayList<>(buses);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public ArrayList<String> getBuses() {
        return new ArrayList<>(buses);
    }

    public void setBuses(ArrayList<String> buses) {
        this.buses = buses == null ? new ArrayList<>() : new ArrayList<>(buses);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BusStation that = (BusStation) o;

        if (!Objects.equals(name, that.name)) return false;
        if (!Objects.equals(city, that.city)) return false;
        return buses.equals(that.buses);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + buses.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "BusStation{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", buses=" + buses +
                '}';
    }
    public void addBus(String bus){
        ArrayList<String> temp = new ArrayList<>(buses);
        temp.add(bus);
        buses = temp;
    }

    public void removeBus(String bus){
        ArrayList<String> temp = new ArrayList<>(buses);
        temp.remove(bus);
        buses = temp;
    }

}
