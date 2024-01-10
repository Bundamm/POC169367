package zadC1;

import java.util.ArrayList;

public class C1merge {
    public <T> ArrayList<T> mergeLists(ArrayList<T> a1, ArrayList<T> a2){
        ArrayList<T> temp = new ArrayList<>(a1);
        temp.addAll(a2);
        return temp;
    }
}
