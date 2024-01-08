package zad22;

public class ElectricCar extends Car{
    private int speed;

    public ElectricCar(String model, int speed) {
        super(model);
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

}
