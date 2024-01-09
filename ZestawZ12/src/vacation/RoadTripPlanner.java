package vacation;

public class RoadTripPlanner implements TravelPlanner{
    @Override
    public void planRoute(String destination){
        System.out.println("Planning Route to "+destination);
    }

    @Override
    public void cancelTrip() {
        TravelPlanner.super.cancelTrip();
    }
}
