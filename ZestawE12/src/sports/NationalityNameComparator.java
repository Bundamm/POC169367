package sports;

import java.util.Comparator;

public class NationalityNameComparator implements Comparator<Athlete> {

    @Override
    public int compare(Athlete o1, Athlete o2) {
        int base = o1.getNationality().compareTo(o2.getNationality());
        if(base != 0){
            return base;
        }
        return o1.getName().compareTo(o2.getName());
    }
}
