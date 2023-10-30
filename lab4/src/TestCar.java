import java.util.Objects;

public class TestCar {

    public static void main(String[] args) {
        //a
        Car c1 = null;
        //b
        if(c1 != null){
            c1.brand = "Fiat";
        }
    }
}
class Car{
    public String brand;

}
