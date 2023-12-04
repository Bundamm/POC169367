import education.*;

import javax.swing.*;
import java.util.Scanner;

public class TestSchool {
    public static void main(String[] args) {
        School s1 = new School("name", "address",200);
        School s2 = new School("name", "address", 250);
        System.out.println(s1.equals(s2));
        System.out.println(s1.hashCode());
        s1.recruitment(1000);
        System.out.println(s1.toString());
        University u1 = new University("name", "address", 1000, "", 20);
        University u2 = new University("", "address", 1000, "", 20);
        System.out.println(u1.equals(u2));
        System.out.println(u1.hashCode());
        u1.recruitment(20000);
        System.out.println(u1.toString());

        System.out.println(u2.toString());


    }
}
