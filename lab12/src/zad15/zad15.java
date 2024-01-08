package zad15;

public class zad15 {
    public static void main(String[] args) {
        Integer[] intArray = {3,8,5,3};
        System.out.println("Najw wartosc w tablicy int: "+ maxValue(intArray));

        String[] strArray = {"aaa","ddd","zzz","ccc"};
        System.out.println("Najw wartosc w tablicy str: "+ maxValue(strArray));

        Vehicle[] vehicles = {
                new Vehicle("Car", 200),
                new Vehicle("Scooter", 100),
                new Vehicle("bingbong", 10)
        };
        System.out.println("Najszybszy pojazd: "+ maxValue(vehicles).toString());
    }
    public static <T extends Comparable<T>> T maxValue(T[] array){
        if(array == null || array.length == 0) {
            throw new IllegalArgumentException("Tablica jest nullem lub jest pusta");
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
