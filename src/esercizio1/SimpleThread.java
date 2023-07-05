package esercizio1;

public class SimpleThread extends Thread {
	private String simbolo;

	public SimpleThread(String simbolo) {
		this.simbolo = simbolo;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() + " " + simbolo);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
