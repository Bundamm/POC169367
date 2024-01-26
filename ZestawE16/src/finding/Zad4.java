package finding;

import java.util.HashMap;

public class Zad4 {
    public static <K,V> V findValueByKey(HashMap<K,V> map, K key){
        if(map.containsKey(key)) return map.get(key);
        return null;
    }

    public static void main(String[] args) {
        HashMap<Integer, Double> mapa = new HashMap<>();
        mapa.put(21, 22.3);
        mapa.put(22, 56.3);
        mapa.put(90, 21.88);
        System.out.println(findValueByKey(mapa, 23));
        System.out.println(findValueByKey(mapa,22));
    }
}
