package zadL1;

import java.util.HashMap;
import java.util.TreeMap;

public class TestL1 {
    public static void main(String[] args) {
        TreeMap<String,Double> t1 = new TreeMap<>();
        t1.put("aaa",45.2);
        t1.put("bbb",4.1);
        t1.put("ccc",42.0);
        t1.put("DDD",43.1);
        t1.put("eee",21.1);
        System.out.println(t1);
        Al a1 = new Al();
        TreeMap<String, Double> result = a1.subMapInRange(t1, "MM", "pp");
        System.out.println(result);
    }
}
