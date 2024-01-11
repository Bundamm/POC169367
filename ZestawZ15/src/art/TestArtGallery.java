package art;

import java.util.ArrayList;

public class TestArtGallery {
    public static void main(String[] args) {
        ArrayList<String> paintings = new ArrayList<>();
        paintings.add("sadsaf");
        paintings.add("dfscsa");
        paintings.add("fsacaxc");
        ArtGallery a1 = new ArtGallery("af","awfdwa", paintings);
        ContemporaryGallery cg1 = new ContemporaryGallery("dawfa","dwadxa",paintings,5);
        a1.addPainting("dawda");
        cg1.addPainting("csac");
        System.out.println(a1.getPaintings());
        System.out.println(cg1.getPaintings());
        a1.removePainting("dawda");
        cg1.removePainting("csac");
        System.out.println(a1.getPaintings());
        System.out.println(cg1.getPaintings());
    }
}
