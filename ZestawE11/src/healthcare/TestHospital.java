package healthcare;

public class TestHospital {
    public static void main(String[] args) {
        Hospital h1 = new Hospital("", 20);
        Hospital h2 = new Hospital("faasd", 20);
        Hospital h3 = new Hospital(null, 20);
        Hospital h4 = new Hospital("", -10);
        Hospital h5 = new Hospital("fof", 15);

        Clinic c1 = new Clinic("", 20,10);
        Clinic c2 = new Clinic(null, 20, 10);
        Clinic c3 = new Clinic("wow", 356, 20);
        Clinic c4 = new Clinic("", -2, 3);
        Clinic c5 = new Clinic("", -2, 4);

        System.out.println(h1.equals(h2));
        System.out.println(h1.equals(h3));
        System.out.println(h1.equals(c1));
        System.out.println(h4.equals(h5));
        System.out.println(c4.equals(c5));
        System.out.println(c2.equals(c1));
        System.out.println(c2.equals(c3));
    }
}
