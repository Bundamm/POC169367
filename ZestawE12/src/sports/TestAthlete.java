package sports;

import java.util.Arrays;

public class TestAthlete {
    public static void main(String[] args) {
        Athlete[] athletes = new Athlete[3];
        athletes[0] = new Athlete("dwasdfaw awefa", "dawfaw", new double[]{3.5,4.2});
        athletes[1] = new Athlete("dx", "dawfxczcw", new double[]{20.5,4.2});
        athletes[2] = new Athlete("ddwafca", "dcxzawfaw", new double[]{1.5,4.2});
        for(Athlete athlete : athletes){
            System.out.println(athlete);
        }
        Arrays.sort(athletes, new RecordComparator().thenComparing(new NationalityNameComparator()));
        for(Athlete athlete : athletes){
            System.out.println(athlete);
        }
    }
}
