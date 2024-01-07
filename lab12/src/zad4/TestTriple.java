package zad4;

public class TestTriple {
    public static void main(String[] args) {
        Triple<Integer, String, Double> triple = new Triple<>(10,"xd", 10.3);
        System.out.println("First: "+ triple.getFirst()+" Second: "+triple.getSecond()+" Third: "+triple.getThird());
    }
}
