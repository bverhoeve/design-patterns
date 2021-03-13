package command.remote;

public class GarageDoorDownCommand implements Command{
    
    private GarageDoor garage;
    public GarageDoorDownCommand(GarageDoor garage) {
        this.garage = garage;
    }


    @Override
    public void execute() {
        garage.stop();
        garage.down();
        garage.lightOff();
    }

    public void undo() {
        garage.stop();
        garage.up();
        garage.lightOn();
    }
}
