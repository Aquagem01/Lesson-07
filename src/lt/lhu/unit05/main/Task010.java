package lt.lhu.unit05.main;

import java.util.Random;

public class Task010 {

	public static void main(String[] args) {
		int a = 15;
		int[] mass = new int[a];
		Task003.initArrRandom(mass);
		Task003.cheTam(mass);
		System.out.println(" ");

		for (int i = 0; i < mass.length; i++) {
			if (mass[i] > i) {
				System.out.print("  " + mass[i] + "  ");
			}
		}

	}

}
