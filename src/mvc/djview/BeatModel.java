package mvc.djview;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.Line;

public class BeatModel implements BeatModelInterface, Runnable {

    List<BeatObserver> beatObservers = new ArrayList<BeatObserver>();
    List<BPMObserver> bpmObservers = new ArrayList<BPMObserver>();
    int bpm = 90;
    Thread thread;
    boolean stop = false;
    Clip clip;

    @Override
    public void initialize() {
        try {
            File resource = new File("/Users/brecht/Development/design-patterns/clap.wav");
            clip = (Clip) AudioSystem.getLine( new Line.Info(Clip.class));
            clip.open(AudioSystem.getAudioInputStream(resource));
        } catch (Exception ex) {
            System.out.println("Error can't load clip");
            System.out.println(ex);
        } 
    }

    @Override
    public void on() {
        this.bpm = 90;
        notifyBPMObservers();
        this.thread = new Thread(this);
        this.stop = false;
        thread.start();

    }

    @Override
    public void run() {
        while(!this.stop) {
            playBeat();
            notifyBeatObservers();
            try {
                Thread.sleep(60000/this.getBPM());
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }

    private void playBeat() {
        clip.setFramePosition(0);
        clip.start();
    }

    @Override
    public void off() {
        stopBeat();
        this.stop = true;
    }

    private void stopBeat() {
        clip.setFramePosition(0);
        clip.stop();
    }

    @Override
    public void setBPM(int bpm) {
        this.bpm = bpm; 
        notifyBPMObservers();

    }

    @Override
    public int getBPM() {
        return bpm; 
    }

    @Override
    public void registerObserver(BeatObserver o) {
        beatObservers.add(o);

    }

    @Override
    public void removeObserver(BeatObserver o) {
        int index = this.beatObservers.indexOf(o);
        if (index >= 0)
            beatObservers.remove(o);

    }

    @Override
    public void registerObserver(BPMObserver o) {
            bpmObservers.add(o);

    }

    @Override
    public void removeObserver(BPMObserver o) {
        int index = this.bpmObservers.indexOf(o);
        if (index >= 0) 
            beatObservers.remove(o);

    }

    private void notifyBPMObservers() {
        for (BPMObserver o : this.bpmObservers) {
            o.updateBPM();
        }
        
    }

    private void notifyBeatObservers() {
        for(BeatObserver o : this.beatObservers) {
            o.updateBeat();
        }
    }


    
}
