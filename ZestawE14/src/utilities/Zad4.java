package utilities;

public class Zad4 {
    public static <T extends Comparable<T>> int countLessThanOrEqual(T[] arr, T obj){
        int counter = 0;
        for(int i = 0; i < arr.length; i++){
            if(obj.compareTo(arr[i]) >= 0){
                counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        Person[] tab = new Person[3];
        tab[0] = new Person("asda",3);
        tab[1] = new Person("sacxz", 2);
        tab[2] = new Person("sacxz", 1);
        Person p1 = new Person("wowo", 3);
        System.out.println(countLessThanOrEqual(tab, p1));

    }
}
