package vacation;

public class FlightPlanner implements TravelPlanner{
    @Override
    public void planRoute(String destination) {
        System.out.println("Planning Flight to "+destination);
    }

    @Override
    public void cancelTrip() {
        TravelPlanner.super.cancelTrip();
    }
}
