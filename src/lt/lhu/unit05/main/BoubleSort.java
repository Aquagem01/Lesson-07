package lt.lhu.unit05.main;

import java.util.Random;

public class BoubleSort {

	public static void main(String[] args) {
		int a = 100;
		double[] mass = new double[a];
		init(mass);
		cheTamD(mass);
		boubleSort(mass);
		System.out.print("\n");
		cheTamD(mass);
		
	}

	public static void init(double[] mass) {
		Random rand = new Random();
		for (int i = 0; i < mass.length; i++) {
			mass[i] = rand.nextDouble(10.0);
		}
	}

	public static void cheTamD(double[] mass) {
		for (int i = 0; i < mass.length; i++) {
			System.out.printf("%4.2f\t", mass[i]);
		}
	}
	
	public static void boubleSort (double[] mass) {
		boolean flag = false;
		int count = 0;
		while (!flag) {
			flag = true;
			for (int i = 0; i < mass.length - 1; i++) {
				if (mass[i] < mass[i+1]) {
					double temp = mass[i];
					mass[i] = mass[i+1];
					mass[i+1] = temp;
					flag = false;
					count++;
				}
			
			}
			
		}
		System.out.println ("\ncount: " + count);
	}
}
