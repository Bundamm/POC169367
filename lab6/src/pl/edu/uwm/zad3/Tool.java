package pl.edu.uwm.zad3;

public class Tool {
    private String name;
    protected Tool(String name){
        this.name = name;
    }
    public static Tool createTool(String name){
        return new Tool(name);
    }
}
