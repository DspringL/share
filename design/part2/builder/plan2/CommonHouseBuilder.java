package design.part2.builder.plan2;

public class CommonHouseBuilder extends HouseBuilder {

	@Override
	public void buildBasic() {
		house.setBasic("平房打地基1米");
	}

	@Override
	public void buildWall() {
		house.setWall("平房砌墙泡沫砖");
	}

	@Override
	public void buildRoof() {
		house.setWall("平房封底橡胶板");
	}

	@Override
	public House buildHouse() {
		return house;
	}

}
