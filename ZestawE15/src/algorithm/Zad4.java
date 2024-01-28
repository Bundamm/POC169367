package algorithm;


import java.util.ArrayList;
import java.util.Collection;

public class Zad4 {
    public static <T> void clearIfContains(Collection<T> boi, T element){
        if(boi == null) {
            throw new IllegalArgumentException("Kolekcja nie może być null");
        }
        if(boi.contains(element)){
            boi.clear();
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(2);
        arr.add(3);
        arr.add(4);
        System.out.println(arr);
        clearIfContains(arr,3);
        System.out.println(arr);
    }

}
