package org.animalia.species;

public class TestBird {
    public static void main(String[] args) {
        Bird b1 = new Bird();
        Bird b2 = new Bird("Pidgeon", 21, true);
        System.out.println(b1.toString());
        System.out.println(b2.toString());
        System.out.println(b1.equals(b2));
        System.out.println(b1.hashCode());
        System.out.println(b2.hashCode());
    }
}
