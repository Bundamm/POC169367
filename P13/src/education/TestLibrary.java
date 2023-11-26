package education;

import java.sql.Array;
import java.util.ArrayList;

public class TestLibrary {
    public static void main(String[] args) {
       ArrayList<Library> tab = new ArrayList<>();
        tab.add(new Library("name", "address", 10));
        tab.add(new SchoolLibrary("name","address", 1000,"średnia",4));
        tab.add(new Library("name", "address", 10));
        tab.add(new SchoolLibrary("name", "address", 2341, "średnia", 8));
        tab.add(new Library("name", "address", 2134));

        for(Library lib : tab){
            lib.addBooks(5000);
            System.out.println(lib.toString());
        }
    }
}
