package interfaces.zad15;

public interface SoundPlayer {
    public abstract void playSound();
    public default void stopSound(){
        System.out.println("Sound Stopped");
    }
    public static String getDeviceType(){
        return "Sound Device";
    }
}
