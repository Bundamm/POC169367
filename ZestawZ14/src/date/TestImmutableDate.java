package date;

public class TestImmutableDate {
    public static void main(String[] args) {
        ImmutableDate date = new ImmutableDate(2002,6,5);
        ImmutableDate date2 = new ImmutableDate(2012,11,19);
        System.out.println(date.toString());
        System.out.println(date2.toString());
        System.out.println(date.equals(date2));
        System.out.println(date.hashCode());
        System.out.println(date2.hashCode());
    }
}
