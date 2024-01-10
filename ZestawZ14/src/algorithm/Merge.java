package algorithm;

import java.util.HashMap;


public class Merge {
    public static <K,V> HashMap<K,V> mergeMaps(HashMap<K,V> first, HashMap<K,V> second){
        HashMap<K, V> third = new HashMap<>(first);
        for(K key : second.keySet()){
            V value2 = second.get(key);
            if(first.containsKey(key)){
                third.remove(key);
                third.put(key, value2);
            }
            th`ird.put(key, value2);
        }
        return third;
    }

    public static void main(String[] args) {
        HashMap<Integer,String> xd = new HashMap<>();
        xd.put(1, "aaa");
        xd.put(2, "bbb");
        xd.put(3,"raaa");
        HashMap<Integer,String> xd2 = new HashMap<>();
        xd2.put(3,"ccc");
        xd2.put(12,"ddd");
        HashMap<Integer,String> xd3 = mergeMaps(xd,xd2);
        System.out.println(xd3);

    }
}
