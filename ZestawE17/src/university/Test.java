package university;

import java.util.ArrayList;
import java.util.Collections;

public class Test {
    public static void main(String[] args) {
        ArrayList<Student> lista = new ArrayList<>();
        lista.add(new Student(123,"aaa",5.3));
        lista.add(new Student(231,"aaaa",2.3));
        lista.add(new Student(111,"zzzz",1.4));
        lista.add(new Student(112, "ddd",1.4));
        lista.add(new Student(118, "ccc", 3.8));
        Collections.sort(lista, new AverageGradeComparator().thenComparing(new IdComparator()));
        for(Student s : lista){
            System.out.println(s);
        }
    }

}
