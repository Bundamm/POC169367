package sports;

import java.util.Arrays;

public class FootballPlayer implements Cloneable{
    private String name;
    private int[] goals;

    public FootballPlayer(String name, int[] goals) {
        this.name = name;
        this.goals = goals;
    }

    @Override
    public String toString() {
        return "FootballPlayer{" +
                "name='" + name + '\'' +
                ", goals=" + Arrays.toString(goals) +
                '}';
    }
    public void changeGoal(int index, int goal){
        if(index >= goals.length){
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        goals[index] = goal;
    }

    @Override
    public FootballPlayer clone() {
        try {
            FootballPlayer clone = (FootballPlayer) super.clone();
            clone.goals = goals.clone();
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
