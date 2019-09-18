package design.part2.factory.abstrac;

/**
 * 具体产品-惠普键盘
 * @author lwz
 *
 */
public class HpKeybo extends Keybo {
	@Override
	public void make() {
		System.out.println("生产了惠普键盘");
	}
}
