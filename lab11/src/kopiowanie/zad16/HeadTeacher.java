package kopiowanie.zad16;

public class HeadTeacher extends Teacher implements Cloneable{
    private double bonus;

    public HeadTeacher(String name, int age, double salary, double bonus) {
        super(name, age, salary);
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return super.toString() +
                "bonus=" + bonus;
    }

    @Override
    public HeadTeacher clone() throws CloneNotSupportedException {
        return (HeadTeacher) super.clone();
    }
}
