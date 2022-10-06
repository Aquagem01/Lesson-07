package lt.lhu.unit05.main;

import java.util.Random;

public class Task004 {

	public static void main(String[] args) {
		int a = 10;
		int[] mass = new int[] { 5, 7, 9, 13, 15, 17, 18, 34, 36, 67, 87 };
		int count = analyze(mass);
		//System.out.println("count " + count);
		//System.out.println("length " + mass.length);
		if (count == mass.length) {
			System.out.print("Ascending sequence");
		} else {
			System.out.print("Non-increasing sequence");
		}
	}

	public static int analyze(int[] mass) {
		int count = 1;
		for (int i = 1; i < mass.length; i++) {
			if (mass[i] > mass[i - 1]) { 
				count++;
			} else {
				continue;
			}
		}
		return count;
	}
}
