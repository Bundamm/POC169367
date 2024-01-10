package zadK1;

import java.util.HashMap;

public class TestK1 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("AA", 56);
        map.put("77", 11);
        map.put("kk", 22);
        map.put("ll", 22);
        map.put("ss", 22);
        map.put("ii", 78);
        System.out.println(map);
        K1 k1 = new K1();
        HashMap<Integer, Integer> results = k1.countValueOccurences(map);
        System.out.println(results);

    }
}
