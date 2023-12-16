package comparable.zad18;

public class Film implements Comparable<Film>{
    private String tytul;
    private String rezyser;
    private String gatunek;

    public Film(String tytul, String rezyser, String gatunek) {
        this.tytul = tytul;
        this.rezyser = rezyser;
        this.gatunek = gatunek;
    }

    @Override
    public String toString() {
        return "Film{" +
                "tytul='" + tytul + '\'' +
                ", rezyser='" + rezyser + '\'' +
                ", gatunek='" + gatunek + '\'' +
                '}';
    }

    @Override
    public int compareTo(Film obj) {
        return Integer.compare(this.tytul.length(),obj.tytul.length());
    }
}
