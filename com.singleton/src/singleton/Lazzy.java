package singleton;

class LazzySingleton {

	private static LazzySingleton instance;

	private LazzySingleton() {

	}

	// Lazy initialization is done when client firt time request for the
	// instance
	public static LazzySingleton getInstance() {
		if (instance == null) {
			instance = new LazzySingleton();
		}
		return instance;
	}
}

public class Lazzy {

	static LazzySingleton s1 = null, s2 = null;

	public static void main(String[] args) throws InterruptedException {

		// singleThread();  // comment this method while executing singleThread() method.
		multipleThread(); // comment this method while executing multipleThread()
		

	}

	public static void singleThread() {
		s1 = LazzySingleton.getInstance();
		s2 = LazzySingleton.getInstance();

		if (s1 == s2) {
			System.out.println("Same Object");
		} else {
			System.out.println("Not Singleton");
		}
	}

	public static void multipleThread() throws InterruptedException {

		Thread t1 = new Thread(() -> s1 = LazzySingleton.getInstance());
		Thread t2 = new Thread(() -> s2 = LazzySingleton.getInstance());

		t1.start();
		t2.start();

		t1.join();
		t2.join();

		if (s1 == s2) {
			System.out.println("Same/Single Object");
		} else {
			System.out.println("Not Singleton Object");
		}
	}

}
