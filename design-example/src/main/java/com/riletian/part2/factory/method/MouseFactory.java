package com.riletian.part2.factory.method;


/**
 * 抽象工厂类-鼠标工厂
 * @author lwz
 *
 */
public abstract class MouseFactory {
	/**
	 * 抽象鼠标的方法，由具体的工厂子类实现
	 */
	public abstract Mouse makeMouse();
}
