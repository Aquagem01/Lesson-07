package lt.lhu.unit05.main;

import java.util.Random;

public class Task003 {

	public static void main(String[] args) {
		int a = 15;
		int[] mass = new int[a];
		initArrRandom(mass);
		//cheTam(mass);
		if (mass[0] < 0) {
			System.out.print("\nPreviously encountered a negative number");
		}else {
			System.out.print("\nPreviously encountered a positive number");
		}
		
	}

	public static void initArrRandom(int[] mass) {
		Random rand = new Random();
		for (int i = 0; i < mass.length; i++) {
			mass[i] = rand.nextInt(250) - 10;
		}
	}

	public static void cheTam(int[] mass) {
		for (int i = 0; i < mass.length; i++) {
			if (mass[i] % 2 == 0) {
				System.out.printf(" {" + mass[i] + "} ");
			} else {
				System.out.printf(" [" + mass[i] + "] ");
			}
		}
	}

}
