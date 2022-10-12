package lt.lhu.unit05.main;

public class Task009 {

	public static void main(String[] args) {
		int a = 10; 
		int [] mass = new int [a];
		int [] num1ind1num2ind2 = new int [4];
		Task003.initArrRandom(mass);
		Task003.cheTam(mass);
		System.out.println(" ");
		
		minNumber(mass, num1ind1num2ind2);
		Task003.cheTam(num1ind1num2ind2);
		
		maxNumber(mass, num1ind1num2ind2);
		Task003.cheTam(num1ind1num2ind2);
		
		int temp = 0;
		temp = mass[num1ind1num2ind2[1]]; 
		mass[num1ind1num2ind2[1]] = mass[num1ind1num2ind2[3]];
		mass[num1ind1num2ind2[3]] = temp;
		System.out.println(" ");
		Task003.cheTam(mass);
		
	}

	public static void minNumber (int [] mass, int [] num1ind1num2ind2) {
		int minNum = mass[0];
		int minInd = mass[0];
		for (int i = 0; i < mass.length; i++) {
			if (mass[i] < minNum) {
				minNum = mass[i];
				minInd = i;
				System.out.print("\n**"+minNum+"**\n");
				num1ind1num2ind2[0] = minNum;
				num1ind1num2ind2[1] = minInd;
				
			}
		}
	}	
	
	public static void maxNumber (int [] mass, int [] num1ind1num2ind2) {
		int maxNum = mass [0];
		int maxInd = mass [0];
		for (int i = 0; i < mass.length; i++) {
			if (mass[i] > maxNum) {
				maxNum = mass[i];
				maxInd = i;
				System.out.print("\n**"+maxNum+"**\n");
				num1ind1num2ind2[2] = maxNum;
				num1ind1num2ind2[3] = maxInd;
			}
		}
	}
}
