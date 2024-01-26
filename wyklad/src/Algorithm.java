public class Algorithm {
    public static <T extends Comparable<T>> T maxValue(T[] array){
        if(array == null || array.length == 0){
            throw new IllegalArgumentException("xd");
        }
        T temp = array[0];
        for(var elem : array){
            if(temp.compareTo(elem) < 0){
                temp = elem;
            }
        }
        return temp;
    }
}
