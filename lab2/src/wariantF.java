import java.util.Scanner;
public class wariantF {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        System.out.println("Podaj numer miesiąca.");
        if(a < 0 || a > 12){
            System.out.println("Nieprawidłowy miesiąc.");
        } else {
            if(a == 12 || (a >= 1 && a < 3)){
                System.out.println("Zima");
                return;
            }
            if(a >= 3 && a < 6){
                System.out.println("Wiosna");
                return;
            }
            if(a >= 6 && a < 9){
                System.out.println("Lato");
                return;
            }
            if(a >= 9 && a < 12){
                System.out.println("Jesień");
                return;
            }

        }
    }
}
