package utilities;

public class Zad3 {
    public <T extends Comparable<T>> T findMin(T first, T second, T third){
        if(first.compareTo(second) < 0 && first.compareTo(third) < 0){
            return first;
        }
        if(second.compareTo(first) < 0 && second.compareTo(third) < 0){
            return second;
        }
        else return third;
    }
}
