package pl.sport.zad24;

import java.util.Arrays;

public class TestResults {
    public static void main(String[] args) {
        int size = 4;
        Results r1 = new Results("Tomasz", "Szewa", size);
        for(int i = 0; i < size; i++){
            r1.addResult(i,i*2);
        }
        System.out.println(r1.getFirstName()+", "+r1.getLastName()+", "+ Arrays.toString(r1.getResults()) +", "+r1.averageResult());
    }
}
