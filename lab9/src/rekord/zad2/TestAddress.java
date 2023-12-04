package rekord.zad2;

public class TestAddress {
    public static void main(String[] args) {
        Person p1 = new Person("Tomasz", "Kowalski", new Address("Forteczna", 38, 23456, "Jabłonowo"));
        System.out.println(p1);
    }
}
