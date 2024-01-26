package algorithm;

import java.util.TreeMap;

public class Zad4 {
    public static <K,V> String mapToString(TreeMap<K,V> map){
        StringBuilder temp = new StringBuilder();
        for(K wow : map.keySet()){
            temp.append(wow).append(": ").append(map.get(wow)).append(", ");
        }
        temp.setLength(temp.length()-2);
        return temp.toString();
    }

    public static void main(String[] args) {
        TreeMap<Integer, String> wow = new TreeMap<>();
        wow.put(2, "a");
        wow.put(3, "b");
        wow.put(4, "c");
        System.out.println(mapToString(wow));
    }
}
