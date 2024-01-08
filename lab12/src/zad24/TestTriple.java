package zad24;

public class TestTriple {
    public static void main(String[] args) {

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
