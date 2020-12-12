package facade.hometheater;

public class HomeTheaterFacade {

    Amplifier amp;
    CdPlayer cdPlayer;
    PopcornPopper popper;
    Projector projector;
    Screen screen;
    StreamingPlayer streaming;
    TheaterLights lights;
    Tuner tuner; 
    
    public HomeTheaterFacade(Amplifier amp,
                            CdPlayer cdPlayer,
                            PopcornPopper popper,
                            Projector projector,
                            Screen screen,
                            StreamingPlayer streaming,
                            TheaterLights lights,
                            Tuner tuner) {

                                
        this.amp = amp;
        this.tuner = tuner;
        this.streaming = streaming;
        this.cdPlayer = cdPlayer;
        this.popper = popper;
        this.projector = projector;
        this.screen = screen;
        this.lights = lights;                    

    }


    public void watchMovie(String movie) {
        System.out.println("Get ready to watch a movie");
        popper.on();
        popper.pop();
        lights.dim(10);
        screen.down();
        projector.on();
        projector.wideScreenMode();
        amp.on();
        amp.setSurroundSound();
        amp.setVolume(5);
        streaming.on();
        streaming.play(movie);
    }

    public void endMovie() {
        System.out.println("Shutting movie theater down");
        popper.off();
        lights.off();
        screen.up();
        projector.off();
        amp.off();
        streaming.stop();
        streaming.off();

    }

}
    

