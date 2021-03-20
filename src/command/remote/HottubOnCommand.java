package command.remote;

public class HottubOnCommand implements Command {
	
	private Hottub hottub;
	
	public HottubOnCommand(Hottub hottub) {
		this.hottub = hottub;
	}
	
	@Override
	public void execute() {
		
		hottub.on();
		hottub.jetsOn();
		hottub.bubblesOn();
		hottub.heat();
	}

	@Override
	public void undo() {
		
		hottub.cool();
		hottub.bubblesOff();
		hottub.jetsOff();
		hottub.off();
		
		
	}

}
