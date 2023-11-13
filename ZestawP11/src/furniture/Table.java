package furniture;

public class Table {
    private double price;
    private static Table instance;
    private Table(double price) {
        this.price = price;
    }

    public static Table getInstance(double price) {
        if(instance == null){
            instance = new Table(price);
        }
        return instance;
    }

    public double getPrice() {
        return price;
    }
}
