package healthcare;

public class TestHospital {
    public static void main(String[] args) {
        Hospital h1 = new Hospital("huh", "", 123);
        Hospital h2 = new Hospital("huh", "", 123);
        Clinic c1 = new Clinic("huh", "", 234, "ogólna", 3.5);
        Clinic c2 = new Clinic("huh", "", 234, "", 3.5);
        Hospital h3 = new Hospital(new String("okai"), "", 235);
        System.out.println(h1.equals(h1));
        System.out.println(h1.equals(h2));
        System.out.println(h1.equals(h3));
        System.out.println(h2.equals(c1));
        System.out.println(c1.equals(c2));
        System.out.println(h3.equals(c2));
    }
}
