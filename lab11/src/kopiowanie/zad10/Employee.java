package kopiowanie.zad10;

import java.util.Arrays;

public class Employee implements Cloneable{
    private String name;
    private double[] salaries;

    public Employee(String name, double[] salaries) {
        this.name = name;
        this.salaries = salaries.clone();
    }

    public String getName() {
        return name;
    }

    public double[] getSalaries() {
        return salaries;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salaries=" + Arrays.toString(salaries) +
                '}';
    }

    @Override
    public Employee clone() throws CloneNotSupportedException {
        Employee skopiowany = (Employee) super.clone();
        skopiowany.salaries = this.salaries.clone();
        return skopiowany;
    }
}
