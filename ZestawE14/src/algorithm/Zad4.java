package algorithm;

import java.util.HashMap;

public class Zad4 {
    public static <K,V> int countUniqueKeys(HashMap<K,V> map){
        return map.keySet().size();
    }

    public static void main(String[] args) {
        HashMap<Person, String> map = new HashMap<>();
        map.put(new Person("Janusz"),"idk");
        map.put(new Person("Janusz"), "idk");
        System.out.println(countUniqueKeys(map));
    }
}
