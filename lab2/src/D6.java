import java.util.Scanner;
public class D6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println("Wynik "+ method(n));
    }
    public static double method(int n){
        double temp = 1;
        for(int i = 1; i <= n; i++){
            temp=temp/7;
        }

        return temp;
    }
}
