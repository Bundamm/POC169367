package zad15;

public class zad15 {
    public static void main(String[] args) {

    }
    public <T extends Comparable<T>> T maxValue(T[] array){
        if(array.length == 0) {
            System.out.println("Pusta tablica.");
            return null;
        }
        T max = array[0];
        for(T el : array){
            if(el.compareTo(max) > 0){
                max = el;
            }
        }
        return max;

    }
}
