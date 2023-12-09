package zlozone.zad8;

public class TestComputer {
    public static void main(String[] args) {
        Processor p1 = new Processor(144,20,"AMD");
        Computer c1 = new Computer("AMD","awfl",p1);
        System.out.println(c1.toString());
    }
}
