package pl.edu.uwm.zad19;

import java.util.ArrayList;
import java.util.Objects;

public class JazzAlbum extends MusicAlbum{
    private String jazzGenre;

    public JazzAlbum(String title, String artist, ArrayList<Integer> ratings, String jazzGenre) {
        super(title, artist, ratings);
        this.jazzGenre = jazzGenre;
    }

    public String getJazzGenre() {
        return jazzGenre;
    }

    public void setJazzGenre(String jazzGenre) {
        this.jazzGenre = jazzGenre;
    }

    @Override
    public String toString() {
        return super.toString()+", "+jazzGenre;
    }

    @Override
    public boolean equals(Object o){
        if (!super.equals(o)) return false;

        JazzAlbum jazzAlbum = (JazzAlbum) o;

        return Objects.equals(jazzGenre, jazzAlbum.jazzGenre);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (jazzGenre != null ? jazzGenre.hashCode() : 0);
        return result;
    }
}
