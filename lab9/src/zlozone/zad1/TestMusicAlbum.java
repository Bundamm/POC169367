package zlozone.zad1;

import java.util.ArrayList;

public class TestMusicAlbum {
    public static void main(String[] args) {
        ArrayList<Double> lista = new ArrayList<>();
        lista.add(4.5);
        lista.add(10.0);
        lista.add(3.0);
        MusicAlbum m1 = new MusicAlbum("asfa","fweadade",lista);
        System.out.println(m1.toString());
    }
}
