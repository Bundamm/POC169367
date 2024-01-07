package kopiowanie.zad1;

public class TestStudent {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student s1 = new Student("dsa", 21,4);
        Student s2 = null;
        try {
            s2 = s1.clone();
        } catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        s2.setGrade(20);
        System.out.println(s1.toString());
        System.out.println(s2.toString());

    }

}
