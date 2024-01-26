package university;

import java.util.ArrayList;

public class Zad4 {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("dasda",3.8));
        students.add(new Student("dasda",3.8));
        students.add(new Student("szcaca",4.2));

        Student s1 = new Student("dasda", 3.8);
        Count c1 = new Count();
        int count = c1.countElements(students.iterator(), s1);
        System.out.println(count);

    }

}
