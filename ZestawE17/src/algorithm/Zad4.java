package algorithm;

import java.util.HashMap;
import java.util.Set;

public class Zad4 {
    public static <K,V> String mapToString(HashMap<K,V> map){
        StringBuilder result = new StringBuilder();
        for(HashMap.Entry<K,V> entry : map.entrySet()){
            result.append(entry.getKey()).append(": ").append(entry.getValue()).append(", ");
        }
        if(!result.isEmpty()){
            result.setLength(result.length()-2);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        HashMap<String, Integer> wow = new HashMap<>();
        wow.put("jeden", 2);
        wow.put("dwa", 3);
        wow.put("trzy", 4);
        System.out.println(mapToString(wow));
    }
}
