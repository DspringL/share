package design.part2.builder.plan1;

import org.junit.jupiter.api.Test;

public class HouseTest {
	@Test
	public void test() {
		AbstractHouse commonHouse = new CommonHouse();
		commonHouse.buildBasic();
		commonHouse.buildWall();
		commonHouse.buildRoof();
		
		AbstractHouse hignHouse = new HighHouse();
		hignHouse.buildBasic();
		hignHouse.buildWall();
		hignHouse.buildRoof();
	}
}
