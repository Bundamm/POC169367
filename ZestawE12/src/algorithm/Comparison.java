package algorithm;

public class Comparison {
    public static <T> boolean compareThree(T first, T second, T third){
        return first.equals(second) && second.equals(third);
    }

    public static void main(String[] args) {
        Student s1 = new Student("Dawda", 21);
        Student s2 = new Student("Dawda", 21);
        Student s3 = new Student("Dawda", 21);
        System.out.println(compareThree(s1,s2,s3));
    }
}
