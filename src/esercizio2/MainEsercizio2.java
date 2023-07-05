package esercizio2;

import java.util.Random;

public class MainEsercizio2 {

	public static void main(String[] args) {

		int[] myArray = generaNumeri(3000);

		System.out.println("Array numeri generati casualmente:");
		for (int i = 0; i < myArray.length; i++) {
			System.out.print(myArray[i] + " ");
		}
		System.out.println();

		SimpleThread t1 = new SimpleThread(myArray, 0, 999);
		SimpleThread t2 = new SimpleThread(myArray, 1000, 1999);
		SimpleThread t3 = new SimpleThread(myArray, 2000, 2999);

		t1.start();
		t2.start();
		t3.start();

		try {
			t1.join();
			t2.join();
			t3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		int totalSum = t1.getSum() + t2.getSum() + t3.getSum();
		System.out.println("Somma totale: " + totalSum);
	}

	public static int[] generaNumeri(int n) {
		int[] myArray = new int[n];
		Random rndm = new Random();
		for (int i = 0; i < n; i++) {
			myArray[i] = rndm.nextInt(3000);
		}
		return myArray;
	}
}
