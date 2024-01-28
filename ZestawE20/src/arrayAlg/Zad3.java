package arrayAlg;

public class Zad3 {
    public static <T extends Comparable<T>> int findMaxIndex(T[] tab){
        if(tab == null || tab.length == 0){
            throw new IllegalArgumentException("tablica nie może być null bądź pusta");
        }
        int maxIndex = 0;
        for(int i = 1; i < tab.length; i++){
            if(tab[i].compareTo(tab[maxIndex]) > 0){
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    public static void main(String[] args) {
        VieoGame[] vieoGames = {
                new VieoGame("name", "sad", 10.2f),
                new VieoGame("name", "sad", 2.3f),
                new VieoGame("nam", "bab", 16.3f),
                new VieoGame("asa", "baba", 3.1f)
        };
        int maxIndex = findMaxIndex(vieoGames);
        System.out.println(maxIndex);


    }
}
