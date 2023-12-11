package comparable.zad1;

import java.util.ArrayList;
import java.util.Collections;

public class TestStudent {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Tomasz", 4.68, 2002));
        students.add(new Student("Mateusz", 4.3, 2004));
        students.add(new Student("Michał", 3.9, 2003));
        students.add(new Student("Adam", 4.8, 2002));
        students.add(new Student("Marcel", 4.5, 2002));

        for(var student : students){
            System.out.println(student);
        }
        Collections.sort(students);
        System.out.println("Po sortowaniu");
        for(var student : students){
            System.out.println(student);
        }
    }
}
