package pl.people.zad1;

public class TestPerson {
    public static void main(String[] args) {
        System.out.println(Person.getCounter());
        Person p1 = new Person("bober");
        System.out.println(p1.getCounter());
    }
}
