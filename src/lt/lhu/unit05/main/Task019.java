package lt.lhu.unit05.main;

public class Task019 {

	public static void main(String[] args) {
		int a = 35;
		int[] arr = new int[a]; //{5, 2, 2, 2, 6, 3, 4, 2, 7, 3, 4, 2, 3, 4, 4, };
		Task015.initRandomArr(arr);	
		Task015.cheTam(arr);
			int prom = 0;
			int y = 0;
		for (int z = 0; z < arr.length; z++) {
			int j = 0;
				for (int i = 0; i <arr.length; i++) {
					if (arr[z] == arr[i]) {
						j++;
					}
				}
				if (j > 1) {
				}if (j > y) {
					y = j;
					prom = arr[z];
				}
				
				
		}
		System.out.print("\nNumber; "+prom+"\nAmount of Number: "+y);
		
	}

}
