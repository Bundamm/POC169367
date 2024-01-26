package beverages;

import java.util.ArrayList;

public class TestBev {
    public static void main(String[] args) {
        ArrayList<BeverageItem> bevs = new ArrayList<>();
        bevs.add(new BeverageItem("aaaaaa", 2.2,1.1));
        bevs.add(new BeverageItem("bbb", 2.2, 1.2));
        bevs.add(new BeverageItem("ccc",2.2,0.9));
        bevs.add(new BeverageItem("asdaccx",2.2,21));
        System.out.println(bevs);
        bevs.sort(null);
        System.out.println();
        System.out.println(bevs);
    }
}
