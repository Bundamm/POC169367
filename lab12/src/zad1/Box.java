package zad1;

public class Box<T> {
    private T el;
    public Box(T el){
        this.el = el;
    }
    public Box(){

    }

    public void set(T t) { this.el = t; }
    public T get() { return el; }
}
