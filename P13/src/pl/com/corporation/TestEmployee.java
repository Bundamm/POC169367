package pl.com.corporation;

public class TestEmployee {
    public static void main(String[] args) {
        Employee e1 = new Employee("boy", 20000);
        Employee e2 = new Employee("boyo", 2312323);
        Employee e3 = new Employee("boyo", 231241243);
        Employee e4 = new Employee("boyo", 2426123);
        Employee e5 = new Employee("boyo", 26783123);
        System.out.println(Employee.getTotalEmployeeCount());
    }
}
