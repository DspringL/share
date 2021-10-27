package com.riletian.part2.builder.plan1;

/**
 * 平房
 * @author lwz
 *
 */
public class CommonHouse extends AbstractHouse {
	@Override
	public void buildBasic() {
		System.out.println("平房打地基1米");
	}
	@Override
	public void buildWall() {
		System.out.println("平房砌墙泡沫砖");
	}
	@Override
	public void buildRoof() {
		System.out.println("平房封顶橡胶板");
	}
}
