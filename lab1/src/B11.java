import java.util.Scanner;
public class B11 {
    public static void main(String[] args){
        System.out.println("Podaj trzycyfrową liczbę całkowitą:");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int x = a/100;
        int y = a % 100;
        if(x == y) System.out.println("Liczba "+ a+" Jest palindromem.");
        else System.out.println("Liczba "+a+" nie jest palindromem.");
    }
}
