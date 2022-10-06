package lt.lhu.unit05.main;

public class Task006 {

	public static void main(String[] args) {
		int a = 15;
		int[] mass = new int[a];
		Task003.initArrRandom(mass);
		//Task003.cheTam(mass);

		int minNum = minNumber(mass);
		//System.out.print("\n" + minNum);
		int maxNum = maxNumber(mass);
		//System.out.print("\n" + maxNum);
		int snl = maxNum - minNum;
		System.out.print("\nShortest number line: " + snl);
	}

	public static int minNumber(int[] mass) {
		int minNum = 0;
		for (int i = 0; i < mass.length; i++) {
			if (mass[i] <= minNum) {
				minNum = mass[i];
			}
		}
		return (minNum);
	}

	public static int maxNumber(int[] mass) {
		int maxNum = 0;
		for (int i = 0; i < mass.length; i++) {
			if (mass[i] >= maxNum) {
				maxNum = mass[i];
			}
		}
		return (maxNum);
	}
}
