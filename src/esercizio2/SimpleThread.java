package esercizio2;

public class SimpleThread extends Thread {

	private int[] myArray;
	private int start;
	private int end;
	private int sum;

	public SimpleThread(int[] myArray, int start, int end) {
		this.myArray = myArray;
		this.start = start;
		this.end = end;
		this.sum = 0;
	}

	@Override
	public void run() {
		for (int i = start; i < end; i++) {
			sum += myArray[i];
		}
	}

	public int getSum() {
		return sum;
	}

}