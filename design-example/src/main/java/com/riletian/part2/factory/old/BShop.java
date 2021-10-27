package com.riletian.part2.factory.old;

public class BShop {
	public static Mouse buy(int type) {
		Mouse mouse = null;
		switch (type) {
		case 0:
			mouse =  new DellMouse();
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
