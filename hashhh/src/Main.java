import javax.print.attribute.IntegerSyntax;
import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        HashSet<Integer> sh = new HashSet<>();
        sh.add(1);
        sh.add(1);
        System.out.println(sh);
        Map<Integer,Integer> mpp = new HashMap<>();
        mpp.put(1,1);
        mpp.put(1,2);
        System.out.println(mpp);

        Collection<Integer> integerCollection = new ArrayList<>();
        integerCollection.add(5);
        integerCollection.add(8);
        integerCollection.add(2);
        System.out.println(max(integerCollection));
    }
    public static <T extends Comparable<T>> T max(Collection<T> c){
        if(c == null || c.isEmpty()){
            throw new IllegalArgumentException("xdddd");
        }
        Iterator<T> iterator = c.iterator();
        T largest = iterator.next();
        while(iterator.hasNext()){
            T temp = iterator.next();
//            largest<temp
//            largest-temp<0
//            largest.compareTo(temp)<0
//            temp.compareTo(largest)<0
            if(temp.compareTo(largest)>0 ){
                largest=temp;
            }
        }
        return largest;
    }
}