package transport;

import java.util.Arrays;

public class TestVehicle {
    public static void main(String[] args) {
        Vehicle[] vehicles = {
            new Vehicle("awljkf",123.1,10),
            new Vehicle("awdawd",321,20),
            new Vehicle("awfawf",222,22),
            new Vehicle("wdawascx", 111,8)
        };
        Arrays.sort(vehicles);
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.toString());
        }
    }
}
