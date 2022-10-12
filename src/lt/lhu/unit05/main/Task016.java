package lt.lhu.unit05.main;

public class Task016 {

	public static void main(String[] args) {
		int n = 10;
		int a = 2;
		int sum = 0;
		int max = 0;
		int[] array = new int[n * a];
		Task015.initRandomArr(array);
		Task015.cheTam(array);

		for (int i = 0; i < n; i++) {
			sum = array[i] + array[2 * n - 1 - i];
			System.out.print(
					"\na" + i + "=" + array[i] + "\ta" + (2 * n - 1 - i) + "=" + array[2 * n - 1 - i] + " Sum: " + sum);
			if (sum > max) {
				max = sum;
			}
		}
		System.out.print("\nMax Sum: " + max);

	}

}
