package zad12;

import java.util.Arrays;

public class zad12 {
    public static void main(String[] args) {
        Integer[] arr = {1,2,3,4,5};
        System.out.println("Przed zamianą: "+ Arrays.toString(arr));
        swap(arr, 0,1);
        System.out.println("Po zamianie: " + Arrays.toString(arr));
    }
    static <T> void swap(T[] array, int index1, int index2){
        if((index1 >= array.length || index1 < 0) || (index2 >= array.length || index2 < 0)){
            System.out.println("Nieprawidłowy index(y)");
            return;
        }
        T temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
