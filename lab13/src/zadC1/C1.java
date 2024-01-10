package zadC1;

import java.sql.Array;
import java.util.ArrayList;

public class C1 {
    public static void main(String[] args) {
        C1merge c1 = new C1merge();
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(3);
        list2.add(4);
        ArrayList<Integer> newList = c1.mergeLists(list1,list2);
        System.out.println(newList);
    }
}
