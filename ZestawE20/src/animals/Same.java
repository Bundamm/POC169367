package animals;

public class Same {
    public static <T extends Animal> boolean isSameSpecies(T animal1, T animal2){
        return animal1.getClass().equals(animal2.getClass());
    }

    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        System.out.println(isSameSpecies(dog1,dog2));
    }
}
