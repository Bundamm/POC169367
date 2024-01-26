package algorithm;

import java.util.ArrayList;
import java.util.Iterator;

public class Zad4 {
    public static <T> T atIndex(Iterator<T> iterator, int index){

        if(index < 0){
            throw new IllegalArgumentException("unlucky");
        }

        int curr = 0;
        while(iterator.hasNext()){
            T el = iterator.next();
            if(curr == index){
                return el;
            }
            curr++;
        }
        throw new IndexOutOfBoundsException("Nie ma takiego");
    }

    public static void main(String[] args) {
        ArrayList<Integer> god = new ArrayList<>();
        god.add(4);
        god.add(3);
        god.add(10);
        god.add(2);
        System.out.println(atIndex(god.iterator(),2));
    }
}
