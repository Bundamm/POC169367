package zad24;

public class TestTriple {
    public static void main(String[] args) {
        Triple<Bird> t = new Triple<>(new Bird("Eagle"), new Bird("Eagl"), new Bird("Penguin"));
        Bird minBird = findMin(t);
        System.out.println("minimalny gatunek ptaka: "+minBird.getSpecies());
        Triple<Eagle> t2 = new Triple<>(new Eagle("egeg",2131), new Eagle("asdac",213134), new Eagle("awfacsdsa",12312));
        Eagle minEagle = findMin(t2);
        System.out.println("Minimalny gatunek orła: " +minEagle.getSpecies());
    }
    public static <T extends Bird> T findMin(Triple<? extends T> t){
        T first = t.getOne();
        T second = t.getTwo();
        T third = t.getThree();
        if (first.getSpecies().compareTo(second.getSpecies()) <= 0 && first.getSpecies().compareTo(third.getSpecies()) <= 0){
            return first;
        }
        else if(second.getSpecies().compareTo(first.getSpecies()) <= 0 && second.getSpecies().compareTo(third.getSpecies()) <= 0){
            return second;
        }
        else{
            return third;
        }
    }
}
