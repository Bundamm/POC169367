package comparable.zad11;

import java.util.Arrays;

public class TestStudent {
    public static void main(String[] args) {
        Student[] tab = new Student[4];
        tab[0] = new Student("fawfa", 4.3,2);
        tab[1] = new Student("fawfasaf", 4.5,3);
        tab[2] = new Student("fawfa", 4.1,1);
        tab[3] = new Student("fawfa", 3.8,2);
        for(int i = 0; i<tab.length; i++){
            System.out.println(tab[i].toString());
        }
        Arrays.sort(tab);
        for(int i = 0; i<tab.length; i++){
            System.out.println(tab[i].toString());
        }
    }

}
