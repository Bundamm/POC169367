import java.util.Random;
import java.util.Arrays;
public class F24 {
    public static void main(String[] args) {
        Random random = new Random();
        int tab[] = new int[8];
        for(int i = 0; i<tab.length;i++){
            tab[i] = random.nextInt(1,101);
        }
        System.out.println(Arrays.toString(tab));
        System.out.println(Arrays.toString(sortArray(tab)));

    }
    public static int[] sortArray(int[] tab){
        int[] copy = new int[tab.length];
        for(int i = 0; i<copy.length;i++){
            copy[i] = tab[i];
        }
        Arrays.sort(copy);
        return copy;
    }
}
