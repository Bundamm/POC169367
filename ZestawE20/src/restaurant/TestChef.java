package restaurant;

import java.util.ArrayList;
import java.util.Collections;

public class TestChef {
    public static void main(String[] args) {
        ArrayList<Chef> chefs = new ArrayList<>();
        chefs.add(new Chef(1,"aaa",20));
        chefs.add(new Chef(2,"bbb",30));
        chefs.add(new Chef(3,"aaa",10));
        chefs.add(new Chef(4,"ccc",50));
        chefs.add(new Chef(5,"aaa",5));
        for(Chef chef : chefs){
            System.out.println(chef);
        }
        System.out.println();
        chefs.sort(new SkillLevelNameComparator());
        for(Chef chef : chefs){
            System.out.println(chef);
        }

    }
}
