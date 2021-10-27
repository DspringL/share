package com.riletian.part2.factory.improve;

/**
 * 抽象工厂类-pc工厂
 * @author lwz
 *
 */
public class Factory {
	/**
	 * 生产鼠标
	 * @param type	类型，0：戴尔，1：惠普
	 * @return
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
			throw new RuntimeException("未知的鼠标类型");
		}
		return mouse;
	}
	/**
	 * 生产键盘
	 * @param type	类型，0：戴尔，1：惠普
	 * @return
	 */
	public static Keybo makeKeybo(int type) {
		Keybo keybo = null;
		switch (type) {
		case 0:
			keybo = new DellKeybo();
			break;
		case 1:
			keybo = new HpKeybo();
			break;
		default:
			throw new RuntimeException("未知的键盘类型");
		}
		return keybo;
	}
	/**
	 * 生产耳机
	 * @param type	类型，0：戴尔，1：惠普
	 * @return
	 */
	public static Mic makeMic(int type) {
		Mic mic = null;
		switch (type) {
		case 0:
			mic = new DellMic();
			break;
		case 1:
			mic = new HpMic();
			break;
		default:
			throw new RuntimeException("未知的耳机类型");
		}
		return mic;
	}
}
