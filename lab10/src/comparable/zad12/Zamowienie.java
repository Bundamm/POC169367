package comparable.zad12;

public class Zamowienie implements Comparable<Zamowienie>{
    private String nazwaProduktu;
    private int ilosc;
    private double cenaJednostkowa;

    public Zamowienie(String nazwaProduktu, int ilosc, double cenaJednostkowa) {
        this.nazwaProduktu = nazwaProduktu;
        this.ilosc = ilosc;
        this.cenaJednostkowa = cenaJednostkowa;
    }

    @Override
    public String toString() {
        return "Zamowienie{" +
                "nazwaProduktu='" + nazwaProduktu + '\'' +
                ", ilosc=" + ilosc +
                ", cenaJednostkowa=" + cenaJednostkowa +
                '}';
    }

    @Override
    public int compareTo(Zamowienie obj) {
        int priceComparison = Double.compare(obj.cenaJednostkowa, this.cenaJednostkowa);
        if(priceComparison == 0){
            return Integer.compare(this.ilosc, obj.ilosc);
        }
        return priceComparison;
    }
}
