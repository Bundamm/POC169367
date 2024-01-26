package tourism;

public class TestHotel {
    public static void main(String[] args) {
        Hotel h1 = new Hotel("dawda", 1231);
        Hotel h2 = null;
        try{
            h2 = h1.clone();
            System.out.println(h1);
            h1.setName("dawdawdac");
            System.out.println(h1);
            System.out.println(h2);
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
