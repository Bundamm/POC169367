import pl.edu.uwm.zad1.Person;
public class TestPerson {
    public static void main(String[] args) {
        Person p1 = new Person("Jan", "Kowalski", 25);
        System.out.println(p1.toString());
        Person p2 = new Person("Jan", "Kowalski", 25);
        System.out.println(p1 == p2); // w javie zawsze stary
        System.out.println(p1.equals(p2)); // nadany nowy sens
        System.out.println(p1.hashCode() == p2.hashCode());
    }
}
