package music;

public class Musician implements Cloneable{
    private String name;
    private String instrument;
    private int concertsPlayed;

    public Musician(String name, String instrument, int concertsPlayed) {
        this.name = name;
        this.instrument = instrument;
        this.concertsPlayed = concertsPlayed;
    }

    public int getConcertsPlayed() {
        return concertsPlayed;
    }

    public void setConcertsPlayed(int concertsPlayed) {
        this.concertsPlayed = concertsPlayed;
    }

    @Override
    public Musician clone() throws CloneNotSupportedException {
        return (Musician) super.clone();
    }
}
