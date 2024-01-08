package music;

public class TestMusician {
    public static void main(String[] args) throws CloneNotSupportedException {
        Musician m1 = new Musician("Nickleback", "lmao",2);
        Musician m2 = m1.clone();
        System.out.println("Przed zmianą");
        System.out.println(m1.getConcertsPlayed());
        System.out.println(m2.getConcertsPlayed());
        m1.setConcertsPlayed(5);
        System.out.println("Po zmianie");
        System.out.println(m1.getConcertsPlayed());
        System.out.println(m2.getConcertsPlayed());

    }
}
