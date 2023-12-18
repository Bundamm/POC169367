package comparator.zad3;

import java.util.Arrays;

public class TestSamochod {
    public static void main(String[] args) {
        Samochod[] samochody = {
                new Samochod("Toyota", 2020, 45000),
                new Samochod("Ford", 2019, 45000),
                new Samochod("Scoda", 2018, 45000),
                new Samochod("Honda", 2022, 45000),
                new Samochod("Toyota", 2013, 10000)
        };
        Arrays.sort(samochody);

    }
}
