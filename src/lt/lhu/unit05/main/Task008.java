package lt.lhu.unit05.main;

public class Task008 {

	public static void main(String[] args) {
		int a = 15;
		int[] mass = new int [a];
		Task003.initArrRandom(mass);
		Task003.cheTam(mass);
		
		int neg = 0;
		int zero = 0;
		int poz = 0;
		
		for (int i = 0; i < mass.length; i++) {
			if (mass[i] > 0) {
				poz++;
			} else if (mass[i] < 0) {
				neg++;
			} else if (mass[i] == 0) {
				zero++;
			}
		}

		System.out.print("\nPozitive elements: " + poz+ "\nNegative elements: " +neg+ "\nZero elements: "+zero);
	}

}
