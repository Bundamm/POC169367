package transport;

public class TestBusRoute {
    public static void main(String[] args) {
        BusRoute b1 = new BusRoute("1234152", "Olsztyn", "Mars");
        BusRoute b2 = new BusRoute("123", "Olsztyn", "Grudziądz");
        b1.printDetails();
        b2.printDetails();
        System.out.println(b1.isLongRoute());
        System.out.println(b2.isLongRoute());
    }
}
