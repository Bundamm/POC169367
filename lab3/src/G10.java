import java.util.ArrayList;
import java.util.Random;
public class G10 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();
        for(int i = 0; i < 10; i++){
            list.add(random.nextInt(10,101));
        }
        System.out.println(list);
        System.out.println(copyArray(list));
    }
    public static ArrayList<Integer> copyArray(ArrayList<Integer> list){
        ArrayList<Integer> copy = new ArrayList<>();
        for(int i : list){
            copy.add(i);
        }
//        ArrayList<Integer> copy2 = new ArrayList<>(list);
        return copy;
    }
}
