package education;

public class TestLibrary {
    public static void main(String[] args) {
        Library[] tab = new Library[5];
        tab[0] = new Library("name", "address", 10);
        tab[1] = new SchoolLibrary("name","address", 1000,"średnia",4);
        tab[2] = new Library("name", "address", 10);
        tab[3] = new SchoolLibrary("name", "address", 2341, "średnia", 8);
        tab[4] = new Library("name", "address", 2134);

        for(Library lib : tab){
            lib.addBooks(5000);
            System.out.println(lib.toString());
        }
    }
}
