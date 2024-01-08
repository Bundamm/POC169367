package zad24;

public class Triple<T>{
    private T one;
    private T two;
    private T three;

    public Triple(T one, T two, T three) {
        this.one = one;
        this.two = two;
        this.three = three;
    }

    public T getOne() {
        return one;
    }

    public T getTwo() {
        return two;
    }

    public T getThree() {
        return three;
    }
}
