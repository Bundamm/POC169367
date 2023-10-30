import java.util.ArrayList;

public class TestPerson {
    public static void main(String[] args) {
        ArrayList<Person> list = new ArrayList<>();
        Person person = list.get(0);
        System.out.println(person.name);
        //Index 0 wychodzi poza limit bo arraylist jest pusty
    }
}
class Person{
    public String name;
}
