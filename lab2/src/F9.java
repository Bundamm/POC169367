import java.util.Arrays;
import java.util.Random;
public class F9 {
    public static void main(String[] args) {
        Random random = new Random();

        int[] tab = new int[20];
        for(int i = 0; i < tab.length;i++){
            tab[i] = random.nextInt(1,101);
        }
        int sum_par = 0;
        int sum_npar = 0;
        for(int i = 0; i < tab.length;i++){
            if(tab[i]%2==0) sum_par++;
            else sum_npar++;
        }
        System.out.println(Arrays.toString(tab));
        System.out.println("Suma parzystych: "+sum_par+" Suma nieparzystych: "+sum_npar);


    }
}
