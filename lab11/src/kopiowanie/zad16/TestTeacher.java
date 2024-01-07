package kopiowanie.zad16;

public class TestTeacher {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("fdwad", 23,32141);
        Teacher t2 = null;
        HeadTeacher h1 = new HeadTeacher("dawda",234,2313412,200000);
        HeadTeacher h2 = null;
        try {
            t2 = t1.clone();
            System.out.println(t1);
            System.out.println(t2);
            h2 = h1.clone();
            System.out.println(h1);
            System.out.println(h2);
        } catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
    }
}
