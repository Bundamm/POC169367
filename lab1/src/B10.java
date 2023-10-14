import java.util.Scanner;
public class B10 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj godzinę:");
        int godzina = input.nextInt();
        System.out.println("Podaj minutę:");
        int minuta = input.nextInt();
        System.out.println("Podaj sekundę");
        int sekunda = input.nextInt();
        if(godzina > 24 || godzina < 1 || minuta > 60 || minuta < 0 || sekunda > 60 || sekunda < 0) {
            System.out.println("Błędna godzina!");
            return;
        }
        System.out.println("Poprawna godzina!");
    }
}
