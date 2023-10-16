import java.util.Random;
import java.util.Arrays;
public class F14 {
    public static void main(String[] args) {
        double[] tab = {3,4,5};
        System.out.println(average(tab));
        double[] tab2 = new double[0];
        System.out.println(average(tab2));
    }
    public static double average(double[] tab){
        double temp = 0;
        if(tab.length==0){
            return 0;
        }
        for(double elem:tab){
            temp+=elem;
        }
        temp /= tab.length;
        return temp;
    }
}
