package comparator.zad6;

import java.util.Comparator;

public class CompareProduct implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        int base = Double.compare(o1.getPrice(),o2.getPrice());
        if(base != 0){
            return base;
        }
        return Integer.compare(o1.getId(),o2.getId());
    }
}
