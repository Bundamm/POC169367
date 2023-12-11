package interfaces.zad15;

public class SoundTester {
    public static void main(String[] args) {
        MusicPlayer m1 = new MusicPlayer();
        m1.playSound();
        m1.stopSound();
        System.out.println(SoundPlayer.getDeviceType());
        Radio r1 = new Radio();
        r1.playSound();
        r1.stopSound();


    }
}
