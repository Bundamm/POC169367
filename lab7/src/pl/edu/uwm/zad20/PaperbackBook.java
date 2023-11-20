package pl.edu.uwm.zad20;

public class PaperbackBook extends Book{
    private int numberOfPages;

    public PaperbackBook(String author, String title, int yearOfPublication, int numberOfPages) {
        super(author, title, yearOfPublication);
        this.numberOfPages = numberOfPages;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    @Override
    public String toString() {
        return super.toString()+", "+numberOfPages+".";
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;

        PaperbackBook that = (PaperbackBook) o;

        return numberOfPages == that.numberOfPages;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + numberOfPages;
        return result;
    }
}
