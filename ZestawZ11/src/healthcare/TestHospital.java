package healthcare;

public class TestHospital {
    public static void main(String[] args) throws CloneNotSupportedException {
        Hospital h1 = new Hospital("idk", 10);
        Hospital h2 = null;
        h2 = h1.clone();
        System.out.println(h1.toString());
        System.out.println(h2.toString());

    }
}
