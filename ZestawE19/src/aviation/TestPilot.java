package aviation;

import java.util.ArrayList;

public class TestPilot {
    public static void main(String[] args) {
        ArrayList<Double> temp = new ArrayList<>();
        temp.add(2.4);
        temp.add(2.9);
        temp.add(3.4);
        temp.add(1.2);
        Pilot p1 = new Pilot("yyyyy", temp);
        Pilot p2 = p1.clone();
        System.out.println(p1);
        System.out.println(p2);
        p1.changeHour(2.5,2);
        System.out.println();
        System.out.println(p1);
        System.out.println(p2);
    }
}
