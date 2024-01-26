package transport;

public record BusRoute(String routeNumber, String startLocation, String endLocation) {
    public BusRoute {
        if(routeNumber == null || routeNumber.isEmpty()){
            throw new IllegalArgumentException("routeNumber nie może być pusty.");
        }
    }
    public boolean isLongRoute(){
        return routeNumber.length() > 4;
    }

    public void printDetails(){
        System.out.println("Numer trasy: "+routeNumber+" Lokacja początkowa: "+startLocation+" Lokacja końcowa: "+endLocation);
    }
}
