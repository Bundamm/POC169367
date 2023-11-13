import pl.edu.uwm.a1.*;

import java.util.ArrayList;

public class TestWorkTool {
    public static void main(String[] args) {
        ArrayList<WorkTool> n1 = new ArrayList<>();
        n1.add(new Hammer());
        n1.add(new Screwdriver());
        n1.add(new Saw());
        for(WorkTool elem:n1){
            elem.use();
        }
    }
}
