package pair;

public class Pair<K, V>{
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }
    public K getFirst(){
        return key;
    }
    public V getSecond(){
        return value;
    }
}
