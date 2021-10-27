package com.riletian.part2.factory.simple;


/**
 * 工厂类-鼠标工厂
 * @author lwz
 *
 */
public class MouseFactory {
	/**
	 * 根据类型构建具体的鼠标实例
	 * @param type：鼠标类型，0：戴尔，1：惠普
	 */
	public static Mouse makeMouse(int type) {
		Mouse mouse = null;
		switch (type) {
		case 0:
			mouse = new DellMouse();
			break;
		case 1:
			mouse = new HpMouse();
			break;
		default:
			throw new RuntimeException("未知鼠标类型");
		}
		return mouse;
	}
}
