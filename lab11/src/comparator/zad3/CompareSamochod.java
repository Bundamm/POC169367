package comparator.zad3;

import java.util.Comparator;

public class CompareSamochod implements Comparator<Samochod> {

    @Override
    public int compare(Samochod o1, Samochod o2) {
        return Double.compare(o1.getRokProdukcji(),o2.getRokProdukcji());
    }
}
