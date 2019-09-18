package design.part2.factory.method;

/**
 * 具体的工厂-戴尔鼠标工厂
 * @author lwz
 *
 */
public class HpMouseFactory extends MouseFactory {
	@Override
	public Mouse makeMouse() {
		return new HpMouse();
	}
}
