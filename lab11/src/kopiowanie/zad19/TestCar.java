package kopiowanie.zad19;

public class TestCar {
    public static void main(String[] args) {
        Car c1 = new Car("sada", 34, new Engine(231,"fefsa","123124"));
        Car c2 = null;
        try{
            c2 = c1.clone();
            System.out.println(c1);
            System.out.println(c2);
        } catch(CloneNotSupportedException e){
            e.printStackTrace();
        }

    }
}
