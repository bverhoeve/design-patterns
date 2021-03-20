package command.remote;

public class HottubOffCommand implements Command {

	private Hottub hottub;
	
	public HottubOffCommand(Hottub hottub) {
		this.hottub = hottub;
	}
	
	@Override
	public void execute() {
		
		hottub.cool();
		hottub.bubblesOff();
		hottub.jetsOff();
		hottub.off();
	}

	@Override
	public void undo() {
		
		hottub.on();
		hottub.jetsOn();
		hottub.bubblesOn();
		hottub.heat();
	}

}
