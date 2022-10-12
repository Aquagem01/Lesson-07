package lt.lhu.unit05.main;

import java.util.Random;

public class Task015 {

	public static void main(String[] args) {
		Random rand = new Random();
		int a = 25;
		int c = rand.nextInt(1, 10);
		int d = rand.nextInt(11, 21);
		System.out.print(c + "\n" + d + "\n");
		int[] mass = new int[a];
		initRandomArr(mass);
		cheTam(mass);
		System.out.print("\n");
		for (int i = 0; i < mass.length; i++) {
			if (i >= c && i  <= d) {
				System.out.print(mass[i-1] + "  ");
			}
		}

	}

	public static void initRandomArr(int[] mass) {
		for (int i = 0; i < mass.length; i++) {
			Random rand = new Random();
			mass[i] = rand.nextInt(20);
		}
	}

	public static void cheTam(int[] mass) {
		for (int i = 0; i < mass.length; i++) {
			System.out.printf(" [" + mass[i] + "] ");
		}
	}
}
