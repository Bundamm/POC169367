package comparable.zad18;

import java.util.ArrayList;
import java.util.Collections;

public class TestFilm {
    public static void main(String[] args) {
        ArrayList<Film> filmy = new ArrayList<>();
        filmy.add(new Film("aefxzda","fawe","fw"));
        filmy.add(new Film("asda","faweeee","fw"));
        filmy.add(new Film("aefdadwada","fadsawe","fw"));
        filmy.add(new Film("aefxcda","fawe","fwdsaacx"));
        Collections.sort(filmy);

        for(var film : filmy){
            System.out.println(film.toString());
        }

    }
}
