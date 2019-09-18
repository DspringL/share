package design.part2.singleton.plan2;

/**
 * 饿汉式方式二 （静态代码块）
 * 优点：代码简单，线程安全
 * 缺点：初始就创建，如果该类不常用就对内存造成了浪费
 * 总结：非并发环境且系统资源充足情况下使用
 * @author lwz
 *
 */
public class Singleton {
	private Singleton() {};
	private static final Singleton INSTANCE;
	static {
		INSTANCE = new Singleton();
	}
	public static Singleton getInstance() {
		return INSTANCE;
	}
}
