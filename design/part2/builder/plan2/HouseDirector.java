package design.part2.builder.plan2;

public class HouseDirector {
	private HouseBuilder houseBuilder;
	public HouseDirector(HouseBuilder builder) {
		this.houseBuilder = builder;
	}
	public House constructHouse() {
		houseBuilder.buildBasic();
		houseBuilder.buildWall();
		houseBuilder.buildRoof();
		return houseBuilder.buildHouse();
	}
}
