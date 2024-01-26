package utilities;

import java.sql.Array;
import java.util.ArrayList;

public class Zad3 {
    public static <E> void appendFromEnd(ArrayList<? super E> a1, ArrayList<E> a2){
        a1.addAll(a2);
    }

    public static void main(String[] args) {
        ArrayList<Integer> a1 = new ArrayList<>();
        a1.add(23);
        a1.add(22);
        ArrayList<Integer> a2 = new ArrayList<>();
        a2.add(2311);
        a2.add(123);
        appendFromEnd(a1,a2);
        System.out.println(a1);
    }
}
