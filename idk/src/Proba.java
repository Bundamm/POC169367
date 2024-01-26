import java.util.HashMap;
import java.util.Map;

public class Proba {
    public static <K,V> Map<K,V> mergeMaps(Map<K,V> m1, Map<K,V> m2){
        if(m1 == null || m2 == null){
            throw new IllegalArgumentException("xddd");
        }
        HashMap<K,V> temp = new HashMap<>(m1);
        temp.putAll(m2);
        return temp;
    }

    public static void main(String[] args) {
        Map<Integer, String> xd = new HashMap<>();
        xd.put(123, "XDD");
        Map<Integer, String> xd2 = new HashMap<>();
        xd2.put(123, "rawr");
        Map<Integer, String> xd3 = mergeMaps(xd,xd2);
        System.out.println(xd3);
    }
}
