package combination;

import java.util.Scanner;

public class Combination_main {
	
	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
	    System.out.print("Input Number s > ");
		int s = Integer.parseInt(scan.next());

		System.out.print("Input Number r > ");
		int r = Integer.parseInt(scan.next());
		
		Combination_lib clib = new Combination_lib(s, r);
		if (s > r) {
			System.out.println(s+"C"+r+"=" +clib.getFactorial());
			
		}
	}
}
