package design.part2.factory.abstrac;

/**
 * 具体的工厂-惠普工厂
 * @author lwz
 *
 */
public class HpFactory extends PcFactory {
	@Override
	public Mouse makeMouse() {
		return new HpMouse();
	}
	@Override
	public Keybo makeKeybo() {
		return new HpKeybo();
	}
}
