package mvc.djview;

public interface ControllerInterface {
    void start();
    void stop();
    void quit();
    void setBPM(int bpm);
    void increaseBPM();
    void decreaseBPM();
}
