package furniture;

public class TestTable {
    public static void main(String[] args) {
        Table t1 = new Table(123.45);
        System.out.println(t1.getPrice());
        // ale to nie działa bo konstruktor jest prywatny
    }
}
