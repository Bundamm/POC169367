package sports;

public class TestAthlete {
    public static void main(String[] args) {
        double[] times = {20.2,18.3,15.3,12.8,21.2};
        Athlete a1 = new Athlete("dawsd",times);
        Athlete a2 = null;
        try{
            a2 = a1.clone();
            System.out.println(a2.toString());
        } catch(CloneNotSupportedException e){
            e.printStackTrace();
        }
    }
}
