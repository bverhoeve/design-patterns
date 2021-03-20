package command.remote;

public class TVOffCommand implements Command {

	private TV tv;
	
	public TVOffCommand(TV tv) {
		this.tv = tv;
	}

	@Override
	public void execute() {
		tv.on();
		tv.setInputChannel();
		
	}

	@Override
	public void undo() {
		tv.off();
		
	}
	
	
}
