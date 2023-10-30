public class Dodatkowe {
    public static void main(String[] args) {
        Camera c1 = new Camera();
        c1.setMegapixels(35);
        System.out.println(c1.upgrade(35));
    }
}

class Camera{
    private int megapixels;
    void setMegapixels(int megapixels){
        this.megapixels = megapixels;
    }
    String upgrade(int megapixels){
        String wyn = megapixels+this.megapixels+" :)";
        return wyn;
    }
}
