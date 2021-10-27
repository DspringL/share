package com.riletian.part2.singleton.plan8;

/**
 * 枚举方式
 * 优点：代码简单，线程安全，枚举类特性防止通过反射创建实例
 * 总结：建议使用
 * @author lwz
 *
 */
public enum Singleton {
	INSTANCE;
	Singleton getInstance(){
		return INSTANCE;
	}
}
