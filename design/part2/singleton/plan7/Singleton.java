package design.part2.singleton.plan7;

/**
 * 静态内部类
 * 优点：懒加载（匿名内部类不调用不加载），线程安全（由jvm保证，一个类只会被jvm加载一次）
 * 总结：建议使用
 * @author lwz
 *
 */
public class Singleton {
	private Singleton() {};
	private static class Inner{
		private static final Singleton INSTANCE = new Singleton();
	}
	public static Singleton getInstance() {
		return Inner.INSTANCE;
	}
}
