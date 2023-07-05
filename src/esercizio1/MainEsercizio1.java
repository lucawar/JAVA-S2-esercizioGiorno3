package esercizio1;

public class MainEsercizio1 {

	public static void main(String[] args) {
		Thread t1 = new SimpleThread("!");
		Thread t2 = new SimpleThread("?");
		t1.setName("Thread1");
		t1.start();

		try {
			t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		t2.setName("Thread2");
		t2.start();
	}

}
