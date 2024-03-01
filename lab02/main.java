package lab02;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {

		QueueX mainQueue = new QueueX(5);
		QueueX evenQueue = new QueueX(5);
		QueueX oddQueue = new QueueX(5);

		Scanner sc = new Scanner(System.in);

		while (!mainQueue.isFull()) {
			int x;
			int i = 1;
			System.out.print("Enter transaction ID " + i + ":");
			x = sc.nextInt();
			i++;

			mainQueue.insert(x);
		}

		while (!mainQueue.isEmpty()) {

			int x;
			x = mainQueue.remove();
			if (x % 2 == 0) {
				evenQueue.insert(x);
			} else {
				oddQueue.insert(x);
			}
		}

		System.out.println("PC 1");

		while (!evenQueue.isEmpty()) {
			System.out.println("Transaction " + evenQueue.remove());
		}

		System.out.println("PC 2");
		while (!oddQueue.isEmpty()) {
			System.out.println("Transaction " + oddQueue.remove());
		}

	}
}

