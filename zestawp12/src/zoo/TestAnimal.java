package zoo;

import java.util.ArrayList;

public class TestAnimal {
    public static void main(String[] args) {
        ArrayList<Animal> zwierzeta = new ArrayList<>();
        zwierzeta.add(new Dog());
        zwierzeta.add(new Cat());
        zwierzeta.add(new Dog());
        zwierzeta.add(new Dog());
        zwierzeta.add(new Cat());

        for(Animal zwierze : zwierzeta){
            System.out.println(zwierze.makeSound());
        }
    }
}
