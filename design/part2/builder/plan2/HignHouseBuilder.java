package design.part2.builder.plan2;

public class HignHouseBuilder extends HouseBuilder {
	@Override
	public void buildBasic() {
		house.setBasic("楼房打地基3米");
	}
	@Override
	public void buildWall() {
		house.setWall("楼房砌墙红砖");
	}
	@Override
	public void buildRoof() {
		house.setRoof("楼房封顶水泥板");
	}
}
