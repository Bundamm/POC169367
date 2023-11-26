package education;

public class Library {
    private String name;
    private String location;
    private int books;

    public Library(String name, String location, int books) {
        this.name = (name == null || name.isEmpty()) ? "ul. Wiedzy 123, 00-001 Miasteczko" : name;
        this.location = (location == null || location.isEmpty()) ? "Biblioteka Miejska" : location;
        this.books = books <= 0 ? 1000 : books;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name != null && !name.isEmpty()) {
            this.name = name;
        }
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        if(location != null && !location.isEmpty()) {
            this.location = location;
        }
    }

    public int getBooks() {
        return books;
    }

    public void setBooks(int books) {
        if(books > 0){
            this.books = books;
        }
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ": Name: "+ name+". Location: "+location+". Number of books: "+books+".";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Library library = (Library) o;

        return location.equals(library.location);
    }

    @Override
    public int hashCode() {
        return location.hashCode();
    }

    public void addBooks(int n){
        books += n;
        if(books > 5000) books = 5000;
    }

    public static void checkBookCapacity(Library l){
        System.out.println("Aktualna liczba książek: " + l.books + ". Książki do limitu: "+(5000-l.books)+".");
    }
}
