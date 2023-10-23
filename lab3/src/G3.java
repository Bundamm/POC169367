import java.util.ArrayList;
import java.util.Random;

public class G3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();
        for(int i = 0; i < 10; i++){
            list.add(random.nextInt(10,101));
        }
        System.out.print(list);
        System.out.println("\n"+minimumValue(list));
    }

    public static int minimumValue(ArrayList<Integer> list){
        int small = list.get(0);
//        if(list.isEmpty()){
//            throw new IllegalAccessException("ArrayList is empty.");
//        }
        for(int i : list){
            if(list.get(i) < small) small = list.get(i);
        }
        return small;
    }
}
