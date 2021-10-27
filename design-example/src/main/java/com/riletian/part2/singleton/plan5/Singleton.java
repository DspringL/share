package com.riletian.part2.singleton.plan5;


/**
 * 懒汉式方式二（同步代码块）
 * 优点：代码简单，懒加载
 * 缺点：线程不安全
 * 总结：不建议使用
 * @author lwz
 *
 */
public class Singleton {
	private Singleton() {};
	private static Singleton INSTANCE = null;
	public static Singleton getInstance() {
		if(null ==INSTANCE) {
			synchronized (Singleton.class) {
				INSTANCE = new Singleton();
			}
		}
		return INSTANCE;
	}
}
