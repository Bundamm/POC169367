package pair;

public class TestPair {
    public static void main(String[] args) {
        Pair<Integer, Double> p = new Pair<>(5,21.4);
        System.out.println(p.getFirst());
        System.out.println(p.getSecond());
    }
}
