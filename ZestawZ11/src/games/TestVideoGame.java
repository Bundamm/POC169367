package games;

import java.util.ArrayList;

public class TestVideoGame {
    public static void main(String[] args) {
        ArrayList<VideoGame> games = new ArrayList<>();
        games.add(new VideoGame("aaa","afsasfd",3.423f));
        games.add(new VideoGame("bbb","dasdax",2.42f));
        games.add(new VideoGame("ccc", "sdadjkchxasb",10f));
        games.add(new VideoGame("ddd","dawsxa",9f));
        games.sort(null);
        for(var game : games){
            System.out.println(game);
        }


    }
}
