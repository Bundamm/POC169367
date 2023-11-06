package pl.bookstore.zad14;

public class Book {
    private String title;
    private String author;
    private int publicationYear;
    private String publisher;
    private int numberOfPages;

    Book(String title, String author, int publicationYear, String publisher, int numberOfPages){
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.publisher = publisher;
        this.numberOfPages = numberOfPages;
    }

    public void setTitle(){
        this.title = title;
    }
    public void setAuthor(){
        this.author = author;
    }
    public void setPublicationYear(){
        this.publicationYear = publicationYear;
    }
    public void setPublisher(){
        this.publisher = publisher;
    }
    public void setNumberOfPages(){
        this.numberOfPages = numberOfPages;
    }

    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public int getPublicationYear(){
        return publicationYear;
    }
    public String getPublisher(){
        return publisher;
    }
    public int getNumberOfPages(){
        return numberOfPages;
    }

    public void showInformation(){
        System.out.println(title+", "+author+", "+publicationYear+", "+publisher+", "+numberOfPages);
    }

}
