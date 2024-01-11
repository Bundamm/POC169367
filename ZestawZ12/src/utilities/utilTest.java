package utilities;

import java.util.ArrayList;

public class utilTest {
    public static <E> void appendFromEnd(ArrayList<? super E> d, ArrayList<E> s){
        d.addAll(s);
    }

    public static void main(String[] args) {
        ArrayList<Number> dList = new ArrayList<>();
        ArrayList<Double> sList = new ArrayList<>();
        dList.add(5);
        sList.add(4.0);
        sList.add(3.1);
        sList.add(3.4);
        System.out.println(dList);
        appendFromEnd(dList,sList);
        System.out.println(dList);
    }
}
