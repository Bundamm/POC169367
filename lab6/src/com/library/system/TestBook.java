package com.library.system;

public class TestBook {
    public static void main(String[] args) {
        Book b1 = new Book(1454);
        Book b2 = new Book(2022);
        Book b3 = new Book(2018);
        b3.setYearPublished(2035);
        System.out.println(b1.getYearPublished());
        System.out.println(b2.getYearPublished());
        System.out.println(b3.getYearPublished());
        b3.setYearPublished(2017);
        System.out.println(b3.getYearPublished());
    }
}
