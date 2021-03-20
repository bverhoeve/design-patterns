package command.remote;

public class CeilingFanOnCommand implements Command {
	
	private static  String SETTING;
	private CeilingFan ceilingFan;
	
	public CeilingFanOnCommand(CeilingFan ceilingFan, String setting) {
		this.ceilingFan = ceilingFan;
		this.SETTING = setting;
	}
	
	@Override
	public void execute() {

		if(SETTING.toLowerCase().equals("low")) {
			ceilingFan.level = 0;
		} if(SETTING.toLowerCase().contentEquals("medium")) {
			ceilingFan.level = 1;
		} else {
			ceilingFan.level = 2;
		}
		
		
	}
	
	@Override
	public void undo() {
		
		ceilingFan.off();
			
	}
	
	

}
