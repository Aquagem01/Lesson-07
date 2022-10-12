package lt.lhu.unit05.main;

public class Task017 {

	public static void main(String[] args) {
		int n = 25;
		int[] arr = new int[n];
		Task015.initRandomArr(arr);
		Task015.cheTam(arr);
		int min = findMin(arr);
		System.out.print("\nMin; " + min);

		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == min) {
				count++;
			}
		}
		System.out.print("\nNumber of min: " + count);
		int[] newArr = new int[n - count];
		for (int i = 0, j = 0; i < arr.length; i++, j++) {
			if (arr[i] == min) {
				j--;
				// System.out.print("\nnewArr: "+newArr[i]+"\tarr: "+arr[i]);
			} else {
				newArr[j] = arr[i];
			}
		}
		System.out.print("\n");
		Task015.cheTam(newArr);
	}

	public static int findMin(int[] arr) {
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		return min;
	}

}
