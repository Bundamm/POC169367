package university;

import java.util.Iterator;

public class Count {
    public <T> int countElements(Iterator<T> items, T element){
        int count = 0;
        while(items.hasNext()){
            T curr = items.next();
            if(element.equals(curr)){
                count++;
            }
        }
        return count;
    }
}
