package pl.edu.uwm.zad20;

import java.util.Objects;

public class Book {
    private String author;
    private String title;
    private int yearOfPublication;

    public Book(String author, String title, int yearOfPublication) {
        this.author =  author;
        this.title = title;
        this.yearOfPublication = yearOfPublication;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+", "+author+", "+title+", "+yearOfPublication+".";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;

        return Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return author != null ? author.hashCode() : 0;
    }
}
