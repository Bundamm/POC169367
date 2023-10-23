
public class Dodatkowe {
    public static void main(String[] args) {
        double a = 0.628;
        System.out.println(radianyNaStopnie(a));
    }

    public static double radianyNaStopnie(double rad){
        double stopnie = 0;
        stopnie = (rad * 180)/3.14;
        return stopnie;
    }
}
