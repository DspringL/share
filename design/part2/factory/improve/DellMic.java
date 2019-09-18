package design.part2.factory.improve;

/**
 * 具体产品-戴尔耳机
 * @author lwz
 *
 */
public class DellMic extends Mic {
	@Override
	public void make() {
		System.out.println("生产了戴尔耳机");
	}
}
