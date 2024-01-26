package memory;

public interface MemoryManager {
    public abstract void allocateMemory(int size);
    public default void freeMemory(){
        System.out.println("Memory Freed");
    }
    public static String getMemoryType(){
        return "Memory Type";
    }

}
