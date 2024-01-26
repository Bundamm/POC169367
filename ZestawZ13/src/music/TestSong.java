package music;

import java.util.Arrays;

public class TestSong {
    public static void main(String[] args) {
        Song[] songs = new Song[4];
        songs[0] = new Song("dwafa","wfeafa",200);
        songs[1] = new Song("dwaafwsdafa","wfezxczafa",400);
        songs[2] = new Song("dwacasfaqwfa","zzz",400);
        songs[3] = new Song("dwfsevsafa","ccc",100);
        for(var song : songs){
            System.out.println(song.toString());
        }
        Arrays.sort(songs, new DurationComparator().thenComparing(new ArtistTitleComparator()));
        for(var song : songs){
            System.out.println(song.toString());
        }



    }
}
