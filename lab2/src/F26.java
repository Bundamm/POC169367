import java.util.Arrays;
import java.util.Random;

public class F26 {
    public static void main(String[] args) {
        Random random = new Random();
        int tab[] = new int[8];
        for(int i = 0; i<tab.length;i++){
            tab[i] = random.nextInt(1,101);
        }
        System.out.println(Arrays.toString(tab));
        fillArray(tab,4);
        System.out.println(Arrays.toString(tab));
    }
    public static void fillArray(int[] tab, int n){
        Arrays.fill(tab,n);
    }
}
