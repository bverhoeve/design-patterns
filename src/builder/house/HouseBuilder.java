package builder.house;

import java.util.ArrayList;
import java.util.List;

public abstract class HouseBuilder {
	String name;
	Roof roof;
	Wall wall;
	Window window;
	House house = new House();
		
	public abstract HouseBuilder addWalls();
	public abstract HouseBuilder addWindows();
	public abstract HouseBuilder addRoof();
	
	
	
	public House getHouse() {
		
		house.setName(name);
		house.addRoof(roof);
		house.addWall(wall);
		house.addWindow(window);
		
		
		return house;
	
	}
	public abstract House build();
	
	
	
}