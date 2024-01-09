package vacation;

public class TravelTester {
    public static void main(String[] args) {
        RoadTripPlanner r1 = new RoadTripPlanner();
        FlightPlanner f1 = new FlightPlanner();
        r1.planRoute("Greece");
        r1.cancelTrip();
        f1.planRoute("China");
        f1.cancelTrip();
        System.out.println(TravelPlanner.getTravelMode());
    }
}
