package com.adventure.akt;

public class TestExcursion {
    public static void main(String[] args) {
        Excursion e1 = new Excursion("e1", -19);
        System.out.println(e1.getSpot()+", "+e1.getBudget());
        e1.setSpot("x1");
        e1.setBudget(-10);
        System.out.println(e1.getSpot()+", "+e1.getBudget());
    }
}
