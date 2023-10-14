import java.util.Scanner;
public class C9 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int liczba = input.nextInt();
        int odwrocona = 0;
        while(liczba != 0){
            int cyfra = liczba % 10;
            odwrocona = odwrocona * 10 + cyfra;
            liczba = liczba/10;
        }
        System.out.println(odwrocona);
    }
}
