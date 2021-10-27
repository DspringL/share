package com.riletian.part2.singleton.plan3;

/**
 * 懒汉式方式一
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
			INSTANCE = new Singleton();
		}
		return INSTANCE;
	}
	
}
