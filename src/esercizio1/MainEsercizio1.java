package esercizio1;

public class MainEsercizio1 {

	public static void main(String[] args) {
		Thread t1 = new SimpleThread("!");
		t1.setName("THREAD 1");
		Thread t2 = new SimpleThread("?");
		t2.setName("THREAD 2");
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		t2.start();
	}
}
