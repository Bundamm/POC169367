package pl.com.corporation;

public class Employee {
    private String name;
    private double salary;
    private static int totalEmployeeCount;
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        totalEmployeeCount+=1;
    }

    public static int getTotalEmployeeCount(){
        return totalEmployeeCount;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}
