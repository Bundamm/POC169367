package kopiowanie.zad16;

public class Teacher implements Cloneable{
    private String name;
    private int age;
    private double salary;

    public Teacher(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    @Override
    public Teacher clone() throws CloneNotSupportedException {
        return (Teacher) super.clone();
    }
}
