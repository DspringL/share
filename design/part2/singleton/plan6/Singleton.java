package design.part2.singleton.plan6;


/**
 * 双重检查
 * 优点：懒加载、线程安全
 * 缺点：代码复杂
 * 总结：建议使用
 * @author lwz
 *
 */
public class Singleton {
	private Singleton() {};
	//这里使用volatile关键字，保证多线程下的可见性，以及禁止指令重排
	private static volatile Singleton INSTANCE = null;
	public static Singleton getInstance() {
		if(null ==INSTANCE) {
			synchronized (Singleton.class) {
				if(null ==INSTANCE) {
					INSTANCE = new Singleton();	
				}
			}
		}
		return INSTANCE;
	}
}
