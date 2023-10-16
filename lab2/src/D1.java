
public class D1 {
    public static void main(String[] args){
        System.out.println(suma(4));
        System.out.println(suma(7));
    }
    public static int suma(int n){
        int sum = 0;
        for(int i = 1; i <= n; i++){
            if(i % 2 == 0) sum-=i;
            else sum+=i;
        }
        return sum;
    }
}
