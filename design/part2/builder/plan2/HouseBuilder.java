package design.part2.builder.plan2;

public abstract class HouseBuilder {
	protected House house = new House();
	public abstract void buildBasic();
	public abstract void buildWall();
	public abstract void buildRoof();
	public abstract House buildHouse();
}
