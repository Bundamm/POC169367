package pl.edu.uwm.zad20;

public class TestBook {
    public static void main(String[] args) {
        Book b1 = new Book("asdf","afa",2034);
        Book b2 = new Book("asdf","afa",2034);
        Book b3 = new Book("","afar",2036);
        Book b4 = new Book(new String("asdfo"),"afas",2038);
        System.out.println(b1.equals(b1));
        System.out.println(b1.equals(b2));
        System.out.println(b1.equals(b3));
        System.out.println(b1.equals(b4));
        System.out.println(b1.toString());
        Ebook e1 = new Ebook("asdf","afa",2034,13);
        Ebook e2 = new Ebook("asdf","afa",2034,13);
        Ebook e3 = new Ebook("","afa",2034,16);
        Ebook e4 = new Ebook(new String("asdf"),"afa",2034,13);
        System.out.println(e1.equals(b1));
        System.out.println(e1.equals(e1));
        System.out.println(e1.equals(e2));
        System.out.println(e1.equals(e3));
        System.out.println(e1.equals(e4));
        System.out.println(e1.toString());
        PaperbackBook p1 = new PaperbackBook("asdf","afa",2034, 312);
        PaperbackBook p2 = new PaperbackBook("asdf","afa",2034, 312);
        PaperbackBook p3 = new PaperbackBook("","afa",2034, 312);
        PaperbackBook p4 = new PaperbackBook(new String("asdf"),"afa",2034, 312);
        System.out.println(e1.equals(p1));
        System.out.println(p1.equals(p1));
        System.out.println(p1.equals(p2));
        System.out.println(p1.equals(p3));
        System.out.println(p1.equals(p4));
        System.out.println(p1.toString());

    }
}
