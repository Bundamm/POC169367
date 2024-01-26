package memory;

public class MemoryTester {
    public static void main(String[] args) {
        RAMManager r1 = new RAMManager();
        DiskManager d1 = new DiskManager();
        System.out.println(MemoryManager.getMemoryType());
        r1.allocateMemory(32);
        d1.allocateMemory(321);
        r1.freeMemory();
        d1.freeMemory();

    }
}
