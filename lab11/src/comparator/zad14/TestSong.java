package comparator.zad14;

import java.util.Arrays;

public class TestSong {
    public static void main(String[] args) {
        Song[] songs = new Song[5];
        songs[0] = new Song("az","akl",10);
        songs[1] = new Song("bsdaz","bkcxzcl",20);
        songs[2] = new Song("cxz","ccxxkl",5);
        songs[3] = new Song("czxz","jkl",4);
        songs[4] = new Song("exz","jkl",2);
        Arrays.sort(songs, new DurationComparator());
        for(var song : songs){
            System.out.println(song.toString());
        }
        System.out.println();
        Arrays.sort(songs, new ArtistTitleComparator());
        for(var artist : songs){
            System.out.println(artist.toString());
        }
    }

}
