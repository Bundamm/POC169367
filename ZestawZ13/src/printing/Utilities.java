package printing;


import java.util.*;


public class Utilities {
    public static <E> void printEverySecond(Collection<E> collection){
        boolean print = false;
        for(var c : collection){
            if(print){
                System.out.println(c);
            }
            print = !print;
        }
    }

    public static void main(String[] args) {
        Set<Integer> list = new HashSet<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        printEverySecond(list);
        List<Integer> list2 = new ArrayList<Integer>();
        list2.add(1);
        list2.add(21451245);
        list2.add(2);
        list2.add(124124);
        list2.add(3);
        list2.add(124125);
        printEverySecond(list2);
    }
}
