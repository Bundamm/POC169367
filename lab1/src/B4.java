import java.util.Scanner;
import java.lang.Math;
public class B4 {
    public static void main(String[] args){
        System.out.println("Podaj liczby a, b i c po kolei");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        double delta = b*b - (4 * a * c);
        if(delta < 0){
            System.out.println("tak nie wolno. oj oj");
        }
        else if(delta == 0){
            double x = (-b + Math.sqrt(delta))/ (2 * a);
            System.out.println("x =" +x);
        }
        else {
            System.out.println(delta);
            double x1 = (-b + Math.sqrt(delta))/ (2 * a);
            double x2 = (-b - Math.sqrt(delta))/ (2 * a);
            System.out.println("x1 =" +x1+"\nx2 = "+ x2);
        }

    }
}
