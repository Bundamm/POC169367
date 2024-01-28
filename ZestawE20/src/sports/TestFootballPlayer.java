package sports;

public class TestFootballPlayer {
    public static void main(String[] args) {
        FootballPlayer f1 = new FootballPlayer("name", new int[]{2,34,5,1,2});
        FootballPlayer f2 = null;
        f2 = f1.clone();
        System.out.println(f1);
        System.out.println();
        System.out.println(f2);
        System.out.println();
        f1.changeGoal(4, 10);
        System.out.println(f1);
        System.out.println();
        System.out.println(f2);
    }
}
