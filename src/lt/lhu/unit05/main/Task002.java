package lt.lhu.unit05.main;

public class Task002 {

	public static void main(String[] args) {
		int[] ar = new int[] { 24, 0, 15, 26, 0, 45, 87, 0, 23, 42 };
		int countZero = 0;
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] == 0) {
				countZero++;
			}
		}
		int[] arZer = new int[countZero];
		for (int c = 0, j = 0; c < ar.length; c++) {
			if (ar[c] == 0) {
				arZer[j] = c;
				j++;
			}
		}
		for (int i = 0; i < ar.length; i++) {
			System.out.printf("[%d]", ar[i]);
		}
		for (int i = 0; i < arZer.length; i++) {
			System.out.printf("{%d}", arZer[i]);
		}
	}

}
