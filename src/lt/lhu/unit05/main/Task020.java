package lt.lhu.unit05.main;

public class Task020 {

	public static void main(String[] args) {
		int a = 15;
		int[] arr = new int[a]; 
		Task015.initRandomArr(arr);	
		Task015.cheTam(arr);
			for (int i = 1; i <arr.length; i+=2) {
				arr[i] = 0;
			}
		System.out.print("\n");
		Task015.cheTam(arr);
	}

}
