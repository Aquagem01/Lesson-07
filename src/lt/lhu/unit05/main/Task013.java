package lt.lhu.unit05.main;

import java.util.Random;

public class Task013 {

	public static void main(String[] args) {
		Random rand = new Random();
		int a = 25;
		int k = rand.nextInt (1,10);
		int n = rand.nextInt (11,20);
		int m = rand.nextInt (1,4);
		System.out.print(k+" "+n+" "+m+"\n");
		int count = 0;
		int [] mass = new int [a];
		Task003.initArrRandom(mass);
		Task003.cheTam(mass);
		for (; k <= n; k++) {
			if (mass[k]%m == 0) {
				System.out.print("\nElement: "+mass[k]);
				count++;
			}
			
		}
		System.out.print("\nNumber of elements: "+count);
	}

}
