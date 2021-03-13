package command.remote;

public class SimpleRemote {
    Command slot;

    public SimpleRemote() {}

    public void setCommand(Command command) {
        slot = command;
    }

    public void buttonPressed() {
        slot.execute();
    }
}
