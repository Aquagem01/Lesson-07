package lt.lhu.unit05.main;

import java.util.Random;

public class Task005 {

	public static void main(String[] args) {
		int a = 15;
		int[] mass = new int[a];
		initArrRandom(mass);
		//Task003.cheTam(mass);
		int count = analyzeChet(mass);
		//System.out.print("\n" + count + "\n");
		if (count == 0) {
			System.out.print("\nThere are no even numbers in the sequence\n");
		} else {
			int[] massNewChet = new int[count];
			for (int i = 0, j = 0; i < mass.length; i++) {
				if (mass[i] % 2 == 0) {
					massNewChet[j] = mass[i];
					j++;

				}

			}
			Task003.cheTam(massNewChet);
		}

	}

	public static void initArrRandom(int[] mass) {
		Random rand = new Random();
		for (int i = 0; i < mass.length; i++) {
			mass[i] = rand.nextInt(200);
		}
	}

	public static int analyzeChet(int[] mass) {
		int count = 0;
		for (int i = 0; i < mass.length; i++) {
			if (mass[i] % 2 == 0) {
				count++;
			} else {
				continue;
			}
		}
		return count;
	}

}
