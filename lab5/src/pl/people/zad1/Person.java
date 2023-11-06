package pl.people.zad1;

public class Person {
    private String name;
    private static int counter;

    public Person(String name){
        this.name = name;
        counter++;
    }

    public String getName() {
        return name;
    }

    public static int getCounter() {
        return counter;
    }

}
