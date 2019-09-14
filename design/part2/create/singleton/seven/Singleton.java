package part2.create.singleton.seven;

public class Singleton {
	private Singleton() {}
	private static class SingletonHolder{
		private static Singleton INSTANCE = new Singleton();
	}
	public static Singleton getInstance() {
		return SingletonHolder.INSTANCE;
	}
}
