package arrayAlg;

import java.util.Objects;

public class VieoGame implements Comparable<VieoGame>{
    private String name;
    private String developer;
    private float rating;

    public VieoGame(String name, String developer, float rating) {
        this.name = name;
        this.developer = developer;
        this.rating = rating;
    }

    public float getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return "VieoGame{" +
                "name='" + name + '\'' +
                ", developer='" + developer + '\'' +
                ", rating=" + rating +
                '}';
    }

    @Override
    public int compareTo(VieoGame o) {
        return Float.compare(this.rating, o.rating);
    }
}
