package lt.lhu.unit05.main;

public class Task011 {

	public static void main(String[] args) {
		int a = 15;
		int m = 3;
		int[] mass = new int[a];
		Task003.initArrRandom(mass);
		Task003.cheTam(mass);
		System.out.print("\n");

		for (int i = 0; i < mass.length; i++) {
			int b = mass[i] % m;
			// System.out.print(" " +b+ " ");
			if (b > 0 && b < m - 1) {
				System.out.print("\n  " + mass[i] + "  ");
			}

		}
	}

}
