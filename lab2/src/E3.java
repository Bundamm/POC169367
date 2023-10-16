import java.util.Random;
import java.util.Scanner;
public class E3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.println(generateRandomIntInRange(a,b));
    }

    public static int generateRandomIntInRange(int a, int b){
        Random random = new Random();
        //setseed może się przydać jak chcę określone wyniki.
        return random.nextInt(a,b);
    }
}
