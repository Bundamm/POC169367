import java.lang.StringBuilder;
public class H3 {
    public static void main(String[] args) {
        StringBuilder tekst = new StringBuilder("  ok  ");
        trimming(tekst);
        System.out.println(tekst);
    }

    public static void trimming(StringBuilder tekst){
        for(int i = 0; i < tekst.length();i++){
            if(tekst.charAt(i) == ' '){
                tekst.deleteCharAt(i);
                i--;
            }
        }
    }
}
