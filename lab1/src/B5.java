import java.util.Scanner;
import java.lang.Math;
public class B5 {
    public static void main(String[] args){
        System.out.println("Podaj swój wiek");
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        if(x < 18 && x > 0) {
            System.out.println("Jesteś niepełnoletni");
        }
        else if(x >= 18) {
            System.out.println("Jesteś pełnoletni");
        }
        else if(x >= 65){
            System.out.println("Jesteś emerytem");
        }
        else {
            System.out.println("Nieprawidłowy wiek.");
        }

    }
}
