package zad29;

import java.util.Arrays;

public class TestPair {
    public static void main(String[] args) {
        Tree[] trees = {
                new Tree("idk",8),
                new Tree("sda",21),
                new Tree("dsaxca",100)
        };
        Pair<? super Tree> result = new Pair<>();
        findMinMaxHeight(trees,result);
        System.out.println("Najniższe drzewo: "+ result.getFirst());
        System.out.println("Najwyższe drzewo: "+ result.getSecond());
    }
    public static void findMinMaxHeight(Tree[] trees, Pair<? super Tree> result){
        if(trees == null || trees.length == 0){
            return;
        }
        Arrays.sort(trees);
        result.setFirst(trees[0]);
        result.setSecond(trees[trees.length-1]);

    }

}
