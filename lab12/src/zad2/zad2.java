package zad2;

public class zad2 {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        boolean res = isEqual(a,b);
        System.out.println(res);
    }
    public static <T> boolean isEqual(T ble, T bli){
        if(ble == null && bli == null) return true;
        if(ble == null || bli == null) return false;
        return ble.equals(bli);
    }
}
