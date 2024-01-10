package optimize;

public class optimization {
    public static <T extends Comparable<T>> T findMax(T first, T second, T third){
        if(first.compareTo(second) > 0 && first.compareTo(third) > 0) return first;
        if(second.compareTo(first) > 0 && second.compareTo(third) > 0) return second;
        else return third;
    }
    public static void main(String[] args) {

        System.out.println(findMax(8,4,10));
    }
}
