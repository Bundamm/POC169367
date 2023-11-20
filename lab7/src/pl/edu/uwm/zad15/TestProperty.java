package pl.edu.uwm.zad15;

public class TestProperty {
    public static void main(String[] args) {
        Property p1 = new Property("Olsztyn", 23, 3125123);
        Property p2 = new Property("Olsztyn", 23, 3125123);
        Property p3 = new Property("Olsztyn", 63, 312325128);
        Property p4 = new Property(null, 23, 312532125);
        Property p5 = new Property(new String("Olsztyn"), 21, 312512129);
        System.out.println(p1.equals(p1));
        System.out.println(p1.equals(p2));
        System.out.println(p1.equals(p3));
        System.out.println(p1.equals(p4));
        System.out.println(p1.equals(p5));
        House h1 = new House("Olsztyn", 23, 3125123, 5);
        House h2 = new House("Olsztyn", 23, 3113123, 7);
        House h3 = new House("Olsztyn", 23, 3525123, 8);
        House h4 = new House("Olsztyn", 23, 5123, 9);
        House h5 = new House("Olsztyn", 23, 512123, 10);
        System.out.println(p1.equals(h1));
    }
}
