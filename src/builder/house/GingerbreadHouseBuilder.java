package builder.house;

public class GingerbreadHouseBuilder extends HouseBuilder {
	int numWalls = 4;
	int numWindows = 4;
	String windowMaterial = "Sugar";
	String wallMaterial = "Gingerbread";
	String roofMaterial = "Twizzlers";
	public GingerbreadHouseBuilder() {
		this.name = "Gingerbread House Builder";
		house.setHouseType(HouseType.GINGERBREAD);
	}
	
	@Override
	public HouseBuilder addWalls() {
		// add exterior walls
		for (int i = 0; i < numWalls; i++) {
			house.addWall(new Wall(wallMaterial));
		}
		return this;
	}
	
	@Override
	public HouseBuilder addWindows() {
		for (int i = 0; i < numWindows; i++) {
			house.addWindow(new Window(windowMaterial));
		}
		return this;
	}

	@Override
	public HouseBuilder addRoof() {
		house.addRoof(new Roof(roofMaterial));
		return this;
	}
	

	@Override
	public House build() {
		return house;
	}

}