
public class H17 {
    public static void main(String[] args) {
        StringBuffer tekst = new StringBuffer("matematyka");
        System.out.println(tekst);
        System.out.println(capitalizeEverySecond(tekst));
    }
    public static StringBuffer capitalizeEverySecond(StringBuffer buffer){
        for(int i = 0; i < buffer.length(); i+=2){
            char cur_char = buffer.charAt(i);
            if(Character.isLetter(cur_char)){
                buffer.setCharAt(i, Character.toUpperCase(cur_char));
            }
        }
        return buffer;
    }
}
