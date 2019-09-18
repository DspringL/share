package design.part2.builder.plan1;

/**
 * 楼房
 * @author lwz
 *
 */
public class HighHouse extends AbstractHouse {
	@Override
	public void buildBasic() {
		System.out.println("楼房打地基5米");
	}
	@Override
	public void buildWall() {
		System.out.println("楼房砌墙红砖");
	}
	@Override
	public void buildRoof() {
		System.out.println("楼房封顶水泥板");
	}
}
