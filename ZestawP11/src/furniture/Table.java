package furniture;

public class Table {
    private double price;
    private Table(double price) {
        this.price = price;
    }

    public static Table createTable(double price){
        return new Table(price);
    }

}
