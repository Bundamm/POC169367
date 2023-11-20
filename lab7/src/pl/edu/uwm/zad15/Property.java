package pl.edu.uwm.zad15;

import java.util.Objects;

public class Property {
    private String address;
    private int size;
    private double price;

    public Property(String address, int size, double price) {
        this.address = address;
        this.size = size;
        this.price = price;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+", "+address+", "+size+", "+price+".";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Property property = (Property) o;

        if (size != property.size) return false;
        if (Double.compare(price, property.price) != 0) return false;
        return address.equals(property.address);
    }

    @Override
    public int hashCode() {
        int result;
        result = address.hashCode();
        result = 31 * result + size;
        result = 31 * result + Double.valueOf(price).hashCode();
        return result;
    }
}
