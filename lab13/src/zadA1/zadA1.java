package zadA1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class zadA1 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(3);
        list1.add(6);
        list1.add(3);
        list1.add(-9);
        list1.add(12);
        printUnique(list1);
        HashSet<String> h1 = new HashSet<>();
        h1.add("hhh");
        h1.add("aascd");
        h1.add("hhh");
        printUnique(h1);



    }
    public static <T> void printUnique(Collection<T> items){
        ArrayList<T> temp = new ArrayList<>();
        for(var elem : items){
            if(!temp.contains(elem)){
                temp.add(elem);
            }
        }
        for(var elem : temp){
            System.out.println(elem);
        }
    }
}
