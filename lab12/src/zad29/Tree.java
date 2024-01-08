package zad29;

public class Tree extends Plant{
    private int height;

    public Tree(String name, int height) {
        super(name);
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "Tree{" +
                "height=" + height +
                '}';
    }
}
