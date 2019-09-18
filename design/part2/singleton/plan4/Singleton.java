package design.part2.singleton.plan4;


/**
 * 懒汉式方式二（同步方法）
 * 优点：代码简单，懒加载
 * 缺点：线程不安全，效率低
 * 总结：不建议使用
 * @author lwz
 *
 */
public class Singleton {
	private Singleton() {};
	private static Singleton INSTANCE = null;
	public static synchronized Singleton getInstance() {
		if(null ==INSTANCE) {
			INSTANCE = new Singleton();
		}
		return INSTANCE;
	}
}
