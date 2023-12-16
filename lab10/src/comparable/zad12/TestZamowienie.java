package comparable.zad12;

import java.util.ArrayList;
import java.util.Collections;

public class TestZamowienie {
    public static void main(String[] args) {
        ArrayList<Zamowienie> zamowienia = new ArrayList<>();
        zamowienia.add(new Zamowienie("wafd",213,32));
        zamowienia.add(new Zamowienie("waf23d",13,12));
        zamowienia.add(new Zamowienie("sad",3,8));
        zamowienia.add(new Zamowienie("wdaw",10,42));
        Collections.sort(zamowienia);
        for(var zamowienie : zamowienia){
            System.out.println(zamowienie.toString());
        }
    }


}
