package education;

public class SchoolLibrary extends Library{
    private String schoolType;
    private int librarians;

    public SchoolLibrary(String name, String location, int books, String schoolType, int librarians) {
        super(name, location, books);
        this.schoolType = (schoolType == null || schoolType.isEmpty()) ? "średnia" : schoolType;
        this.librarians = (librarians <= 2) ? 3 : librarians;
    }

    public String getSchoolType() {
        return schoolType;
    }

    public void setSchoolType(String schoolType) {
        if(schoolType != null && !schoolType.isEmpty()) this.schoolType = schoolType;
    }

    public int getLibrarians() {
        return librarians;
    }

    public void setLibrarians(int librarians) {
        if(librarians > 2) this.librarians = librarians;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "School Type: " + schoolType+". Number of librarians: "+librarians+".";
    }

    @Override
    public void addBooks(int n) {
        int bk = getBooks() + n;
        if(bk > 3000) bk = 3000;
        setBooks(bk);
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;
        SchoolLibrary that = (SchoolLibrary) o;
        return schoolType.equals(that.schoolType);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + schoolType.hashCode();
        result = 31 * result + librarians;
        return result;
    }
}
