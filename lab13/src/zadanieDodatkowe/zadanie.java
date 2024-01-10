package zadanieDodatkowe;

public class zadanie {
    public static <T> boolean areBothNull(T first, T second){
        return first == null && second == null;
    }

    public static void main(String[] args) {
        String obj = null;
        Double obj2 = 2.3;
        System.out.println(areBothNull(obj,obj2));
        String obj3 = null;
        Float obj4 = null;
        System.out.println(areBothNull(obj3,obj4));

    }
}
