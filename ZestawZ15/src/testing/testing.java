package testing;

public class testing {
    public static <T> void compareAndPrint(T first, T second){
        if(first.equals(second)) System.out.println("Obiekty są równe");
        else System.out.println("Obiekty nie są równe");
    }

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("WOW", 3);
        Vehicle v2 = new Vehicle("WOW", 4);
        Vehicle v3 = new Vehicle("WOW", 4);
        Vehicle v4 = new Vehicle("WOW", 3);
        compareAndPrint(v1,v2);
        compareAndPrint(v1,v3);
        compareAndPrint(v1,v4);
        compareAndPrint(v2,v3);
    }
}
