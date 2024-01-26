package finding;

public class Zad3 {
    public static <T> T findFirstNonNull(T[] lista){
        for(int i = 0; i<lista.length; i++){
            if(lista[i] != null) return lista[i];
        }
        return null;
    }

    public static void main(String[] args) {
        String[] lista = {null, null, null};
        System.out.println(findFirstNonNull(lista));
        String[] lista2 = {null, null, "abava"};
        System.out.println(findFirstNonNull(lista2));
    }

}
