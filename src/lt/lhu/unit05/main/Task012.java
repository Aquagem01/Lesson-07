package lt.lhu.unit05.main;

public class Task012 {

	public static void main(String[] args) {
		int a = 23;

		boolean f;
		int[] mass = new int[a];
		Task003.initArrRandom(mass);
		Task003.cheTam(mass);
		int summ = 0 + mass[0];
		System.out.print("\n" + summ);
		for (int i = 1; i < mass.length; i++) {
			int poz = i + 1;
			f = examPrimeNumber(poz);
			if (f) {
				summ = summ + mass[i];
				System.out.print("\n" + mass[i]);
			}
		}
		System.out.print("\nsum:" + summ);
	}

	public static boolean examPrimeNumber(int poz) {
		boolean f = true;

		for (int i = 2; i < poz; i++) {
			if (poz % i == 0) {
				f = false;// не простое
			}

		}

		return f;
	}
}
