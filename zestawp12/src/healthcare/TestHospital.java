package healthcare;

public class TestHospital {
    public static void main(String[] args) {
        Hospital h1 = new Hospital("Centralny Szpital Kliniczny", "ul. Zdrowia 100, 00-001 Warszawa", 200);
        Hospital h2 = new Hospital("Centralny Szpital Kliniczny", "", 201);
        Hospital h3 = new Hospital("", "ul. Zdrowia 100, 00-001 Warszawa", 200);
        Hospital h4 = new Hospital("Centralny Szpital Kliniczny", "ul. Zdrowia 100, 00-001 Warszawa", -10);
        Hospital h5 = new Hospital(new String("Centralny Szpital Kliniczny"), "ul. Zdrowia 100, 00-001 Warszawa", -20);
        System.out.println(h1.equals(h1));
        System.out.println(h1.equals(h2));
        System.out.println(h1.equals(h3));
        System.out.println(h1.equals(h4));
        System.out.println(h1.equals(h5));


        Clinic c1 = new Clinic("Boyo", "boiii", 200, "ogólna", 20);
        Clinic c2 = new Clinic("Boyo", "boiii", -10, "ogólna", 20);
        Clinic c3 = new Clinic("Boyo", "boiii", 200, "", 20);
        Clinic c4 = new Clinic("Explosion", "boiii", 200, "chirurgia", -10);
        Clinic c5 = new Clinic(new String("Boyo"), "boiii", 200, "chirurgia", 20);
        System.out.println('\n');
        System.out.println(c1.equals(c1));
        System.out.println(c1.equals(c2));
        System.out.println(c1.equals(c3));
        System.out.println(c1.equals(c4));
        System.out.println(c1.equals(c5));
    }
}
