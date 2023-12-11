package interfaces.zad17;

public class VATTest {
    public static void main(String[] args) {
        double productPrice = 100;
        double priceWithVAT = VATCalculator.calculateWithVAT(productPrice);
        System.out.println(priceWithVAT);
    }
}
