package comparisons;

public class Zad3 {
    public static <T extends Comparable<T>> boolean isFirstLargest(T first, T second, T third){
        return first.compareTo(second) > 0 && first.compareTo(third) > 0;
    }

    public static void main(String[] args) {
        System.out.println(isFirstLargest(10,11,2));
    }
}
