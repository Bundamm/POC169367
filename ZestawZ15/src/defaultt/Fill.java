package defaultt;


import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Queue;



// nie da się nazwać pakietu default
public class Fill {
    public static <T> void fillWithDefaultValue(Collection<T> c, T first){
        if(c == null){
            throw new IllegalArgumentException("Kolekcja nie może być nullem");
        }
        int temp = c.size();
        c.clear();
        for(int i = 0; i < temp; i++){
            c.add(first);
        }
    }

    public static void main(String[] args) {
        Collection<Integer> integerCollection = new ArrayList<>();
        integerCollection.add(23);
        integerCollection.add(18);
        System.out.println(integerCollection);
        fillWithDefaultValue(integerCollection, 10);
        System.out.println(integerCollection);
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);

    }
}
