package pl.edu.uwm.zad20;

public class Ebook extends Book{
    private int fileSize;

    public Ebook(String author, String title, int yearOfPublication, int fileSize) {
        super(author, title, yearOfPublication);
        this.fileSize = fileSize;
    }

    public int getFileSize() {
        return fileSize;
    }

    public void setFileSize(int fileSize) {
        this.fileSize = fileSize;
    }

    @Override
    public String toString() {
        return super.toString()+", "+fileSize;
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;

        Ebook ebook = (Ebook) o;

        return fileSize == ebook.fileSize;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + fileSize;
        return result;
    }
}
