import java.util.Scanner;
public class C19 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj pięć liczb całkowitych.");
        int sum = 0;
        for(int i = 0; i < 5; i++){
            int a = input.nextInt();
            if(a < 0){
                System.out.println("Liczby nie mogą być ujemne!");
                return;
            }
            sum += a;
        }
        System.out.println(sum);
    }
}
