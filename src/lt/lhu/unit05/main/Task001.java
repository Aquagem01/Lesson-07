package lt.lhu.unit05.main;

import java.util.Random;

public class Task001 {

	public static void main(String[] args) {
		int a = 10;
		int k = 3;
		int sum = 0;
		int[] mass = new int[a];
		initArrRandom (mass);
		
		for (int i = 0; i < mass.length; i++) {
			System.out.print("{"+mass[i]+"} ");//для самоконтроля
			if (mass[i] % k == 0) {
				sum = sum + mass[i];
			}
		}
		System.out.print("\n" + sum);

	}
	public static void initArrRandom (int[] arr) {
		Random rand = new Random();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextInt(10);
		}
	}
}
