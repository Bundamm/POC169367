package pl.edu.uwm.motorcycles;

public class TestMotorcycle {
    public static void main(String[] args) {
        Motorcycle m1 = new Motorcycle("Yamaha", 2012, 3);
        System.out.println(m1.toString());
        Motorcycle m2 = new Motorcycle("", 2014, 4);
        System.out.println(m2.toString());
    }
}
