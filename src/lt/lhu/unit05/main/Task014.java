package lt.lhu.unit05.main;

public class Task014 {

	public static void main(String[] args) {
		int a = 28;
		int [] mass = new int[a];
		Task003.initArrRandom(mass);
		Task003.cheTam(mass);
		int minEven = 0;
		int maxNotEven = 0;
		
		for (int i = 0; i < mass.length; i++) {
			if (mass[i]%2==0) {
				if (minEven > mass[i]) {
					minEven = mass[i];
				}
			}else if (mass[i]%2!=0) {
				if (maxNotEven < mass[i]) {
					maxNotEven = mass[i];
				}
			}
		}
		int sum = minEven+maxNotEven;
		System.out.print("\nMin even: "+minEven+"\nMax not even: "+maxNotEven+"\nSum of numbers:"+sum);
		

	}

}
