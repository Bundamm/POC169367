package comparable.zad9;

import java.util.Arrays;

public class TestMusic {
    public static void main(String[] args) {
        Music[] music = new Music[4];
        music[0] = new Music("awlfna","fawfwa",2002);
        music[1] = new Music("awfdwa","dawd",2009);
        music[2] = new Music("wajdfna", "dwa", 2123);
        music[3] = new Music("dwa", "dawdaw", 2001);
        for(int i = 0 ; i < music.length; i++){
            System.out.println(music[i].getReleaseYear());
        }
        Arrays.sort(music);
        for(int i = 0 ; i < music.length; i++){
            System.out.println(music[i].getReleaseYear());
        }
    }
}
