package mvc.djview;
  
public class DJTestDrive {

    public static void main (String[] args) {
        //BeatModelInterface model = new BeatModel();
        //ControllerInterface controller = new BeatController(model);
        DJView view = new DJView();
        view.createView();
        view.createControls();
        view.disableStopMenuItem();
        view.enableStartMenuItem();
        
    }
}
