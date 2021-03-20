package command.remote;

public class StereoOnCommand implements Command {
	
	private Stereo stereo;
	private String input;
	public StereoOnCommand(Stereo stereo, String input) {
		this.stereo = stereo;
		this.input = input;
	}

	@Override
	public void execute() {
		stereo.on();
		stereo.setVolume(15);
		
		if(input.toLowerCase().equals("radio")) {
			stereo.setRadio();
		} if(input.toLowerCase().equals("cd")) {
			stereo.setCD();
		} else {
			stereo.setDVD();
		}
		
		
	}

	@Override
	public void undo() {
		stereo.off();
	}

}
