package create;

import java.lang.reflect.Array;

public class zad3 {
    public static <T> T[] createArray(T first, T second, T[] array){
        array[0] = first;
        array[1] = second;
        return array;
    }

    public static void main(String[] args) {
        Integer x = 4;
        Integer y = 5;
        Integer[] temp = new Integer[2];
        createArray(x,y, temp);
        System.out.println(temp[0]);
        System.out.println(temp[1]);
    }
}
