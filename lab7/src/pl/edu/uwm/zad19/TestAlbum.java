package pl.edu.uwm.zad19;

import java.util.ArrayList;

public class TestAlbum {


    public static void main(String[] args) {
        ArrayList<Integer> points1 = new ArrayList<>();
        points1.add(10);
        points1.add(9);
        ArrayList<Integer> points2 = new ArrayList<>();
        points2.add(10);
        points2.add(10);
        MusicAlbum a1 = new MusicAlbum("Demon Days","Gorillaz", points1);
        MusicAlbum a2 = new MusicAlbum("Demon Days","Gorillaz", points1);
        MusicAlbum a3 = new MusicAlbum("","Gorillazz", points1);
        MusicAlbum a4 = new MusicAlbum(new String("Demon Days"),"Gorillaz",points1);
        System.out.println(a1.equals(a2));
        System.out.println(a1.toString());
        RockAlbum r1 = new RockAlbum("Meliora", "Ghost", points2, "Hard Rock");
        RockAlbum r2 = new RockAlbum("Meliora", "Ghost", points2, "Hard Rock");
        RockAlbum r3 = new RockAlbum("Melioraa", "Ghost", points2, "Hard Rock");
        RockAlbum r4 = new RockAlbum(new String("Meliora"), "Ghost", points2, "");
        System.out.println(r1.equals(r4));
        System.out.println(r1.toString());
        JazzAlbum j1 = new JazzAlbum("The Comet Is Coming", "Hyper-Dimensional Expansion Beam", points2, "Electronic Jazz");
        JazzAlbum j2 = new JazzAlbum("The Comet Is Coming", "Hyper-Dimensional Expansion Beam", points2, "Electronic Jazz");
        System.out.println(j1.equals(j2));
        System.out.println(j1.toString());


    }
}
