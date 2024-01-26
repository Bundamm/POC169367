package checking;

public class Zad3 {
    public static <T> boolean containsDuplicates(T first, T second, T third){
        return first.equals(second) || first.equals(third) || second.equals(third);
    }

    public static void main(String[] args) {
        System.out.println(containsDuplicates(1,3,3));
    }
}
