package books;

import java.util.ArrayList;

public class TestBook {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("xd","xdd",2321));
        books.add(new Book("x", "xdd", 2002));
        books.add(new Book("xxxd","xxxxx",2131));
        books.add(new Book("xdd","x",2018));
        for(var book : books){
            System.out.println(book.toString());
        }
        books.sort(null);
        for(var book : books){
            System.out.println(book.toString());
        }

    }
}
