import education.*;
public class TestSchool {

    public static void main(String[] args) {
        School s1 = new School("", "", -300);
        School s2 = new School("UWM", "ul. Słoneczna 54, 10-710 Olsztyn", 1);
        System.out.println(s1.toString());
        System.out.println(s1.equals(s2));
        s1.recruitment(501);
        School.checkLimit(s1);
        University u1 = new University("", "" , -1, "", -10);
        University u2 = new University("UWM", "ul. Słoneczna 54, 10-710 Olsztyn", 200, "university of technology", 10);
        u1.recruitment(100);
        System.out.println(u1.toString());
        System.out.println(u1.equals(u2));
    }
}
