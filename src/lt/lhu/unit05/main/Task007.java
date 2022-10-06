package lt.lhu.unit05.main;

public class Task007 {

	public static void main(String[] args) {
		int a = 10;
		int[] mass = new int[a];
		Task003.initArrRandom(mass);
		// Task003.cheTam(mass);
		int zamen = zamen(mass);
		System.out.print("Vse zameneno\nzamen - " + zamen + "\n");
		// Task003.cheTam(mass);

	}

	public static int zamen(int[] mass) {
		int zamen = 0;
		int z = -5;
		for (int i = 0; i < mass.length; i++) {
			if (mass[i] > z) {
				mass[i] = z;
				zamen++;
			} else {
				continue;
			}
		}
		return zamen;
	}
}
