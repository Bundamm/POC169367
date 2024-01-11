package art;

import java.util.ArrayList;
import java.util.Objects;

public class ArtGallery {
    private String name;
    private String city;
    private ArrayList<String> paintings;

    public ArtGallery(String name, String city, ArrayList<String> paintings) {
        this.name = name;
        this.city = city;
        this.paintings = paintings == null ? new ArrayList<>() : new ArrayList<>(paintings);
    }
    public void addPainting(String painting){
        this.paintings.add(painting);
    }
    public void removePainting(String painting){
        this.paintings.remove(painting);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public ArrayList<String> getPaintings() {
        return new ArrayList<>(paintings);
    }

    public void setPaintings(ArrayList<String> paintings) {
        this.paintings = paintings == null ? new ArrayList<>() : new ArrayList<>(paintings);
    }

    @Override
    public String toString() {
        return "ArtGallery{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", paintings=" + paintings +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ArtGallery that = (ArtGallery) o;

        if (!Objects.equals(name, that.name)) return false;
        if (!Objects.equals(city, that.city)) return false;
        return paintings.equals(that.paintings);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + paintings.hashCode();
        return result;
    }


}
