package algorithm;

import java.util.LinkedList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        ItemManager<Integer> xd = new ItemManager<Integer>();
        xd.addItem(32);
        xd.addItem(10);
        xd.addItem(12);
        System.out.println(xd.getItem(1));
        System.out.println(xd.getItemCount());
    }
}
