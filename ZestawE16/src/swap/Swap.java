package swap;

public class Swap {
    public static <T> void swapElements(T[] loool, int first, int second){
        T temp = loool[first];
        loool[first] = loool[second];
        loool[second] = temp;
    }

    public static void main(String[] args) {
        Integer[] integers = {2,3};
        for(Integer i : integers){
            System.out.println(i);
        }
        swapElements(integers,0,1);
        for(Integer i : integers){
            System.out.println(i);
        }
        VideoGame[] videoGames = {
                new VideoGame("dawda","cxsacz",312),
                new VideoGame("dascz","xzczxv",12.4f)
        };
        for(VideoGame game : videoGames){
            System.out.println(game);
        }
        swapElements(videoGames, 0, 1);
        for(VideoGame game : videoGames){
            System.out.println(game);
        }
    }
}
