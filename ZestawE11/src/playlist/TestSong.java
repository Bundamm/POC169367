package playlist;

import playlist.ArtistTitleComparator;
import playlist.DurationComparator;
import playlist.Song;

import java.util.Arrays;

public class TestSong {
    public static void main(String[] args) {
        Song[] songs = new Song[5];
        songs[0] = new Song("wowow", "wow", 5);
        songs[1] = new Song("wowowo", "wow", 5);
        songs[2] = new Song("wowzers", "wow", 6);
        songs[3] = new Song("wowers", "wow", 2);
        songs[4] = new Song("mamma mia", "wow", 4);
        for(Song song : songs){
            System.out.println(song.toString());
        }
        System.out.println();
        Arrays.sort(songs, new DurationComparator().thenComparing(new ArtistTitleComparator()));
        for (Song song : songs) {
            System.out.println(song.toString());
        }
    }
}
