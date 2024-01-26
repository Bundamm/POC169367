package algorithm;

import java.util.HashMap;
import java.util.Map;


public class Merge {
    public static <K,V> Map<K,V> mergeMaps(Map<K,V> first, Map<K,V> second){
        Map<K,V> result = new HashMap<>(first);
        result.putAll(second);
        return result;

    }
    public static void main(String[] args) {
        Map<Integer,String> xd = new HashMap<>();
        xd.put(1, "aaa");
        xd.put(2, "bbb");
        xd.put(3,"raaa");
        Map<Integer,String> xd2 = new HashMap<>();
        xd2.put(3,"ccc");
        xd2.put(12,"ddd");
        Map<Integer, String> result = mergeMaps(xd,xd2);
//        for(Map.Entry<Integer,String> x : result.entrySet()){
//            System.out.println(x.getKey() + " " + x.getValue());
//        }
        System.out.println(result);
    }
}
