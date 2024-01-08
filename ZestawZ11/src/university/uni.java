package university;

import java.util.Arrays;

public class uni {
    public static <T extends Comparable<T>> T findMedian(T[] elements){
        if(elements == null || elements.length == 0){
            throw new IllegalArgumentException("Tablica pusta");
        }
        Arrays.sort(elements);

        int middleIndex = elements.length/2;
        return elements[middleIndex];
    }

    public static void main(String[] args) {
        Student[] students = new Student[4];
        students[0] = new Student("awfa",4.32f);
        students[1] = new Student("awfa",4.67f);
        students[2] = new Student("awfa",3.32f);
        students[3] = new Student("awfa",4.22f);
        System.out.println(findMedian(students).toString());
    }
}
