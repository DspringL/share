package design.part2.builder.plan1;

/**
 * 抽象房子
 * @author lwz
 *
 */
public abstract class AbstractHouse {
	/**
	 * 打地基
	 */
	public abstract void buildBasic();
	/**
	 * 砌墙
	 */
	public abstract void buildWall();
	/**
	 * 封顶
	 */
	public abstract void buildRoof();
}
