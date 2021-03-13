package command.remote;

public class GarageDoorUpCommand implements Command{
    
    private GarageDoor garage;
    public GarageDoorUpCommand(GarageDoor garage) {
        this.garage = garage;
    }


    @Override
    public void execute() {
        garage.stop();
        garage.up();
        garage.lightOn();
    }

    public void undo() {
        garage.stop();
        garage.down();
        garage.lightOff();
    }
}
