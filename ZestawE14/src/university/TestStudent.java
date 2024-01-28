package university;

import java.util.Arrays;

public class TestStudent {
    public static void main(String[] args) {
        Student[] students = new Student[4];
        students[0] = new Student("bob", 3.4,1);
        students[1] = new Student("bob", 2.4,4);
        students[2] = new Student("bob", 4.4,1);
        students[3] = new Student("bob", 4.4,2);
        for(Student s : students){
            System.out.println(s);
        }
        Arrays.sort(students);
        for(Student s : students){
            System.out.println(s);
        }

    }
}
