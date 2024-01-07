package wyjatki.zad1;

public class zad1 {
    public static void main(String[] args) {

    }
    public static void checkAge(int age) throws IllegalAccessException {
        if(age < 18){
            throw new IllegalAccessException("Wiek nie może być mniejszy niż 18.");
        }
        System.out.println("Wiek jest odpowiedni: "+ age);
    }

}
