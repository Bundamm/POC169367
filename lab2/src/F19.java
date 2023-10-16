import java.util.Random;
import java.util.Arrays;
public class F19 {
    public static void main(String[] args) {
        int[] tab = new int[10];
        Random random = new Random();
        for(int i = 0; i<tab.length;i++){
            tab[i] = random.nextInt(1,101);
        }
        System.out.println(Arrays.toString(tab));
        System.out.println(Arrays.toString(copyArray(tab)));
        int[] tab3 = new int[0];
        System.out.println(Arrays.toString(tab3));
        System.out.println(Arrays.toString(copyArray(tab3)));
    }
    public static int[] copyArray(int[] tab){
        int[] copy = new int[tab.length];
        for(int i = 0; i < tab.length; i++){
            copy[i] = tab[i];
        }
        return copy;
    }
}
