package art;

import java.util.ArrayList;

public class ContemporaryGallery extends ArtGallery{
    private int numberOfInstallations;

    public ContemporaryGallery(String name, String city, ArrayList<String> paintings, int numberOfInstallations) {
        super(name, city, paintings);
        this.numberOfInstallations = numberOfInstallations;
    }

    public int getNumberOfInstallations() {
        return numberOfInstallations;
    }

    public void setNumberOfInstallations(int numberOfInstallations) {
        this.numberOfInstallations = numberOfInstallations;
    }

    @Override
    public String toString() {
        return super.toString()+" numberOfInstallations: " +numberOfInstallations;
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;

        ContemporaryGallery that = (ContemporaryGallery) o;

        return numberOfInstallations == that.numberOfInstallations;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + numberOfInstallations;
        return result;
    }
}
