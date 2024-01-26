package aviation;

public class TestPilot {
    public static void main(String[] args) {
        Pilot p1 = new Pilot("baba", new double[]{2.3,11.38, 12.34, 9.30});
        Pilot p2 = null;
        try{
            p2 = p1.clone();
            p1.changeHour(2, 2.2);
            System.out.println(p1);
            System.out.println();
            System.out.println(p2);
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }

    }
}
