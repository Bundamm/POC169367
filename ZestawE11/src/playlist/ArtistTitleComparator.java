package playlist;

import java.util.Comparator;

public class ArtistTitleComparator implements Comparator<Song> {


    @Override
    public int compare(Song o1, Song o2) {
        int base = o1.getArtist().compareTo(o2.getArtist());
        if(base != 0){
            return base;
        }
        return o1.getTitle().compareTo(o2.getTitle());
    }
}
