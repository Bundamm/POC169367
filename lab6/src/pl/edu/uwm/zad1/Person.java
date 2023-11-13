package pl.edu.uwm.zad1;

import java.util.Objects;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = (firstName.isEmpty() || firstName == null) ? "" : firstName;
        this.lastName = (lastName.isEmpty() || lastName == null) ? "" : lastName;
        this.age = age < 0 ? 0 : age;

    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+": "+this.firstName+" "+this.lastName+", Age: " + this.age+".";
    }

    @Override
    public boolean equals(Object obj) {
        if(this ==  obj) return true;

        if(obj == null || getClass() != obj.getClass()) return false;

        Person person = (Person) obj;

        if(age != person.age) return false;
        if(person.firstName == null) return false; // zależność konstruktora
        if(!firstName.equals(person.firstName)) return false;
        if(person.lastName == null) return false; // zależność konstruktora
        return lastName.equals(person.lastName);
    }

    @Override
    public int hashCode() {
        int result = firstName.hashCode();
        result = 31 * result + lastName.hashCode();
        result = 31 * result + age;
        return result;
    }
}
