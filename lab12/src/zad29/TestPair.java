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
        Tree min = trees[0];
        Tree max = trees[0];

        for(var elem: trees){
            if(elem.compareTo(min) < 0){
                min = elem;
            }
            if(elem.compareTo(max) > 0){
                max = elem;
            }
        }
        result.setFirst(min);
        result.setSecond(max);
    }

}
