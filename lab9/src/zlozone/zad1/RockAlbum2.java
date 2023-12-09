package zlozone.zad1;

import java.util.Objects;

public class RockAlbum2 extends MusicAlbum2 {
    private String rockGenre;

    public RockAlbum2(String title, String artist, double[] ratings, String rockGenre) {
        super(title, artist, ratings);
        this.rockGenre = rockGenre;
    }

    public String getRockGenre() {
        return rockGenre;
    }

    public void setRockGenre(String rockGenre) {
        this.rockGenre = rockGenre;
    }

    @Override
    public String toString() {
        return super.toString() +
                " rockGenre: " + rockGenre+".";
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;

        RockAlbum2 that = (RockAlbum2) o;

        return Objects.equals(rockGenre, that.rockGenre);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (rockGenre != null ? rockGenre.hashCode() : 0);
        return result;
    }
}
