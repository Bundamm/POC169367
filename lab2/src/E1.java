import java.util.Random;
public class E1 {
    public static void main(String[] args) {
        System.out.println(generateRandomInt());
    }

    public static int generateRandomInt(){
        Random ran = new Random();
//        ran.setSeed(345553);
        return ran.nextInt();
    }
}

