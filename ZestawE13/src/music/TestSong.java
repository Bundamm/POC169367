package music;

import java.util.Arrays;

public class TestSong {
    public static void main(String[] args) {
        Song[] songs = new Song[4];
        songs[0] = new Song("aaa", "ddd", 20);
        songs[1] = new Song("bbb", "bbb", 20);
        songs[2] = new Song("aaa", "aaa", 21);
        songs[3] = new Song("aaa", "ccc", 20);
        for(Song song : songs){
            System.out.println(song);
        }
        Arrays.sort(songs, new DurationComparator().thenComparing(new ArtistTitleComparator()));
        System.out.println();
        for(Song song : songs){
            System.out.println(song);
        }

    }
}
