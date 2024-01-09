package utilities;

import java.util.ArrayList;

public class utilTest {
    public static <E> void appendFromEnd(ArrayList<? super E> d, ArrayList<E> s){
        d.addAll(s);
    }

    public static void main(String[] args) {
        ArrayList<Integer> dList = new ArrayList<>();
        ArrayList<Integer> sList = new ArrayList<>();
        dList.add(5);
        sList.add(1);
        sList.add(2);
        sList.add(3);
        System.out.println(dList);
        appendFromEnd(dList,sList);
        System.out.println(dList);
    }
}
