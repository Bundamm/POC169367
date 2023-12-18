package comparator.zad3;

import java.util.Comparator;

public class Samochod implements Comparator<Samochod> {
    private String marka;
    private int rokProdukcji;
    private double cena;

    public Samochod(String marka, int rokProdukcji, double cena) {
        this.marka = marka;
        this.rokProdukcji = rokProdukcji;
        this.cena = cena;
    }


    @Override
    public String toString() {
        return "Samochod{" +
                "marka='" + marka + '\'' +
                ", rokProdukcji=" + rokProdukcji +
                ", cena=" + cena +
                '}';
    }

    @Override
    public int compare(Samochod o1, Samochod o2) {
        return Integer.compare(o1.rokProdukcji, o2.rokProdukcji);
    }
}
