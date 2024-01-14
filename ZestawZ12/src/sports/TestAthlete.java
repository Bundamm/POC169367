package sports;

public class TestAthlete {
    public static void main(String[] args) {
        double[] times = {20.2,18.3,15.3,12.8,21.2};
        Athlete a1 = new Athlete("dawsd",times);
        Athlete a2 = a1.clone();
        a1.setTime(28,1);
        System.out.println(a1.toString());
        System.out.println(a2.toString());

    }
}
