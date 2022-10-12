package lt.lhu.unit05.main;

public class SelectionSort {

	public static void main(String[] args) {
		int a = 100;
		double[] mass = new double[a];
		BoubleSort.init(mass);
		BoubleSort.cheTamD(mass);
		selectionSort(mass);
		System.out.print("\n");
		BoubleSort.cheTamD(mass);
	}

	public static void selectionSort(double[] mass) {
		int min = 0;
		for (int z = 0; z < mass.length - 1; z++) {
			min = z;

			for (int i = z + 1; i < mass.length; i++) {
				if (mass[min] > mass[i]) {
					min=i;}
			}
			
			double temp = 0;
			temp = mass[z];
			mass[z] = mass[min];
			mass[min] = temp;
		}
	
		
	}

}