package design.part2.factory.improve;

/**
 * 具体产品-戴尔键盘
 * @author lwz
 *
 */
public class DellKeybo extends Keybo {
	@Override
	public void make() {
		System.out.println("生产了戴尔键盘");
	}
}
