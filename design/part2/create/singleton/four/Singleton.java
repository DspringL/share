package part2.create.singleton.four;

public class Singleton {
	private static Singleton INSTANCE = null;
	private Singleton() {}
	public static synchronized Singleton getInstance() {
		if(null ==INSTANCE) {
			INSTANCE = new Singleton();
		}
		return INSTANCE;
	}
}
