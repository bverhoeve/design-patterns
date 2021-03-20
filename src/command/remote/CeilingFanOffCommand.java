package command.remote;

public class CeilingFanOffCommand implements Command {
	
	private static  String SETTING;
	private CeilingFan ceilingFan;
	
	public CeilingFanOffCommand(CeilingFan ceilingFan, String setting) {
		this.ceilingFan = ceilingFan;
		this.SETTING = setting;
	}
	
	@Override
	public void execute() {
		
		ceilingFan.off();
	}
	
	@Override
	public void undo() {
		
		if(SETTING.toLowerCase().equals("low")) {
			ceilingFan.level = 0;
		} if(SETTING.toLowerCase().contentEquals("medium")) {
			ceilingFan.level = 1;
		} else {
			ceilingFan.level = 2;
		}
			
	}
	
	

}
