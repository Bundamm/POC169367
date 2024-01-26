package notmod;

public class Lol {
    public static void main(String[] args) {
        InmutablePoint i1 = new InmutablePoint(3.5,2.1,8.7);
        System.out.println(i1.getX());
        System.out.println(i1.getY());
        System.out.println(i1.getZ());
        System.out.println(i1);
        System.out.println(i1.hashCode());
    }
}
