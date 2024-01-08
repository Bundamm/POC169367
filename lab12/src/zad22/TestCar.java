package zad22;

public class TestCar {

    public static <T extends Car> boolean compareObjects(T object1, T object2){
        return object1.getClass().equals(object2.getClass());
    }
    public static void main(String[] args) {
        Car car1 = new Car("afwa");
        Car car2 = new Car("adsasda");
        ElectricCar e1 = new ElectricCar("dfada",1234);
        System.out.println("car1 i car2 są równe: " + compareObjects(car1,car2));
        System.out.println("car1 i e1 nie są równe: "+compareObjects(car1,e1));
    }

}
