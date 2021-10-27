package com.riletian.part2.factory.abstrac;

/**
 * 具体的工厂-戴尔工厂
 * @author lwz
 *
 */
public class DellFactory extends PcFactory {
	@Override
	public Mouse makeMouse() {
		return new DellMouse();
	}
	@Override
	public Keybo makeKeybo() {
		return new DellKeybo();
	}
}
