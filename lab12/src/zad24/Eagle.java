package zad24;

public class Eagle extends Bird{
    private int speed;

    public Eagle(String species, int speed) {
        super(species);
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }
}
