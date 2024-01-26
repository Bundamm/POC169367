package moto;

public class Zad3 {
    public static <T extends Comparable<T>> T maxValue(T[] tab){
        if(tab == null || tab.length == 0){
            throw new IllegalArgumentException("pusta bądź nullowa tablica");
        }
        T temp = tab[0];
        for(T el : tab){
            if(el.compareTo(temp) > 0) temp = el;
        }
        return temp;
    }

    public static void main(String[] args) {
        Vehicle tab[] = new Vehicle[3];
        tab[0] = new Vehicle("d", 20);
        tab[1] = new Vehicle("d", 25);
        tab[2] = new Vehicle("d", 56);
        System.out.println(maxValue(tab));

    }
}
