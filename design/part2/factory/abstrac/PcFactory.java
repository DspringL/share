package design.part2.factory.abstrac;


/**
 * 抽象工厂类-pc工厂
 * @author lwz
 *
 */
public abstract class PcFactory {
	/**
	 * 抽象鼠标的方法，由具体的工厂子类实现
	 */
	public abstract Mouse makeMouse();
	/**
	 * 抽象键盘的方法，由具体的工厂子类实现
	 */
	public abstract Keybo makeKeybo();
}
