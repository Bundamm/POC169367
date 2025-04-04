package zlozone.zad1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class MusicAlbum2 {
    private String title;
    private String artist;
    private double[] ratings;

    public MusicAlbum2(String title, String artist, double[] ratings) {
        this.title = title == null ? "" : title;
        this.artist = artist == null ? "" : title;
        this.ratings = ratings == null ? new double[0] : ratings.clone();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public double[] getRatings() {
        return ratings;
    }

    public void setRatings(double[] ratings) {
        this.ratings = ratings == null ? new double[0] : ratings.clone();
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                " title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                ", ratings=" + ratings;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MusicAlbum2 that = (MusicAlbum2) o;

        if (!Objects.equals(title, that.title)) return false;
        if (!Objects.equals(artist, that.artist)) return false;
        return Arrays.equals(ratings, that.ratings);
    }

    @Override
    public int hashCode() {
        int result = title != null ? title.hashCode() : 0;
        result = 31 * result + (artist != null ? artist.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(ratings);
        return result;
    }

    public void addRating(Double rating){
        double[] rat = new double[ratings.length+1];
        for(int i = 0; i < ratings.length; i++){
            rat[i] = ratings[i];
        }
        rat[ratings.length] = rating;
        ratings = rat;
    }

    public void remRating(int index){
        double[] res = new double[ratings.length-1];
        for(int i = 0; i < res.length; i++){
            res[i] = ratings[i<index ? i : i + 1];
        }
        ratings = res;
    }
}
