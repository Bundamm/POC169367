
public class H8 {
    public static void main(String[] args) {
        String napis = "Witam";
        String suffiks = "m";
        String prefiks = "W";

        if(napis.startsWith(prefiks) && napis.endsWith(suffiks)) {
            System.out.println("Prefiks i sufiks zgadzają się.");
        }
        else if(napis.startsWith(prefiks)){
            System.out.println("Prefiks zgadza się.");
        }
        else if(napis.endsWith(suffiks)) {
            System.out.println("Sufiks zgadza się.");
        }
        else{
            System.out.println("Ani sufiks ani prefiks nie zgadzają się.");
        }

    }

}
