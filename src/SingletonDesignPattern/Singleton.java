package SingletonDesignPattern;

public class Singleton {
	
	private static Singleton instance=null;
	
	private Singleton() {
		System.out.println("Singleton nesne oluþtu");
	}
	
	public static Singleton getInstance() {
		if(instance==null) {
			instance = new Singleton();
			return instance;
		}else
			return instance;
	}
	
	public static void main(String[] args) {
		
		Singleton s = Singleton.getInstance();
	}

}
