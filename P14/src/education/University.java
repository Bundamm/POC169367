package education;

public class University extends School{
    private String type;
    private int studies;

    public University(String name, String address, int students, String type, int studies) {
        super(name, address, students);
        this.type = (type == null || type.isEmpty()) ? "university of technology" : type;
        this.studies = (studies < 0) ? 10 : studies;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        if(type != null && !type.isEmpty())  this.type = type;
    }

    public int getStudies() {
        return studies;
    }

    public void setStudies(int studies) {
        if(studies >= 0) this.studies = studies;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "Type: " + type+". Number of fields of study: "+ studies+".";
    }

    @Override
    public void recruitment(int n) {
        super.recruitment(n);
        studies += 0.1 * n;
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;

        University that = (University) o;

        return studies == that.studies;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + studies;
        return result;
    }
}
