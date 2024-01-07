package kopiowanie.zad19;

public class Car implements Cloneable{
    private String make;
    private int model;
    private Engine engine;

    public Car(String make, int model, Engine engine) {
        this.make = make;
        this.model = model;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model=" + model +
                ", engine=" + engine +
                '}';
    }
    @Override
    public Car clone() throws CloneNotSupportedException{
        Car temp = (Car) super.clone();
        temp.engine = engine.clone();
        return temp;
    }
}
