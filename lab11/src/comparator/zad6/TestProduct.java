package comparator.zad6;

import java.util.Arrays;

public class TestProduct {
    public static void main(String[] args) {
        Product[] products = {
                new Product(12,"sdafa",12.4),
                new Product(123214,"sdafa",12.4),
                new Product(1422,"sdafa",12.4),
                new Product(12222,"sdafa",112),
                new Product(124329,"sdafa",4)
        };
        Arrays.sort(products, new CompareProduct());
        for(var product : products){
            System.out.println(product.toString());
        }
    }
}
