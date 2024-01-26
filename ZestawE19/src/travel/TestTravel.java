package travel;

import java.util.Arrays;

public class TestTravel {
    public static void main(String[] args) {
        TravelItem[] items = {
              new TravelItem("sdad",2.3,3.4),
              new TravelItem("sdada", 1.2, 3.5),
              new TravelItem("xzcz", 1.1, 3.2)
        };
        for(TravelItem item : items){
            System.out.println(item);
        }
        Arrays.sort(items);
        for(TravelItem item : items){
            System.out.println(item);
        }

    }
}
