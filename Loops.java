import java.util.Scanner;

public class Loops {
	public static void main(String[] args) {
		//drugPot();
		exercise5();




		// String s = "My String";
		// int length = findLength(s);
		// System.out.println(length);

		// System.out.println(findLength(s));


		// int x = 1; // start
		// while (x <= 100) { // stopping condition
		// 	System.out.println(x); // loop action
		// 	x++; // change
		// }

		// for (int i=1; i <= 100; i++ ) {
		// 	System.out.println(i);
		// }
		// int z = 45;

		// while (z >= 20) {
		// 	System.out.println(z);
		// 	z = z-5;
		// }
		// for (int i = 24; i<=68; i=i+2) {
		// 	System.out.println(i);
		// }
	}
	// public static int findLength(String str) {
	// 	int len = 0;
	// 	for (int i = 0; i<str.length(); i++) {
	// 		len++;
	// 	}
	// 	return len;
	// }
	public static void drugPot() {
		double percent = 0.04;
		int month = 0;
		double effect;
		double z = 100.0;


		while (z >= 50.0) {
			
			System.out.println("Month: " + month + " Effectiveness: " + z);
			month++;
			effect = z*percent;
			z = z-effect;
			
			if (z < 50) {
				System.out.println("Month: " + month + " Effectiveness: " + z + " DISCARD");
				
				
			}
		}
		
	}
	public static void exercise5() {
		int value;
		Scanner reader = new Scanner(System.in);

		System.out.println("Please enter a positive integer: ");
		value = reader.nextInt();
		while (value > 1) {
			if (value % 2 == 0) {
				value = value/2;
				System.out.println(value);
			} else {
				value = (3*value) + 1;
				System.out.println(value);
			}

			
		}
		System.out.println("You have Reached 1!");
	}
	public static void exercise3() {
		
	}
}