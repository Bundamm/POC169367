package transport;

import java.util.ArrayList;

public class IntercityBusStation extends BusStation{
    private int numberOfPlatforms;

    public IntercityBusStation(String name, String city, ArrayList<String> buses, int numberOfPlatforms) {
        super(name, city, buses);
        this.numberOfPlatforms = numberOfPlatforms;
    }

    public int getNumberOfPlatforms() {
        return numberOfPlatforms;
    }

    public void setNumberOfPlatforms(int numberOfPlatforms) {
        this.numberOfPlatforms = numberOfPlatforms;
    }

    @Override
    public String toString() {
        return "IntercityBusStation{" +
                "numberOfPlatforms=" + numberOfPlatforms +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        IntercityBusStation that = (IntercityBusStation) o;

        return numberOfPlatforms == that.numberOfPlatforms;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + numberOfPlatforms;
        return result;
    }
}
