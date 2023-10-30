
public class TestDog {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.bark();
        dog1.setName("Burek");
        dog1.setAge(3);
        dog1.setBreed("German Shepherd");
        System.out.println(dog1.getName());
        System.out.println(dog1.getBreed());
        System.out.println(dog1.getAge());

    }


}

class Dog{
    public String name;
    public String breed;
    public int age;

    void bark(){
        System.out.println("Wow wow!");
    }

    public void setName(String name){
        this.name = name;
    }
    public void setBreed(String breed){
        this.breed = breed;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String getName(){
        return this.name;
    }
    public String getBreed(){
        return this.breed;
    }
    public int getAge(){
        return this.age;
    }
}

