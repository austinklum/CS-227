import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Sub-Prime UVa 11679
 * @author Austin Klum
 *
 */

public class SubPrime {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner scan = new Scanner(System.in);
		//Scanner scan = new Scanner(new File("input.txt"));
		int n = scan.nextInt();
		int b = scan.nextInt();
		
		while(n != 0 && b != 0) {
			int[] banks = new int[b+1];
			
			for (int i = 1; i <= b; i++) {
				banks[i] = scan.nextInt();
			}
			String bail = "S";
			for (int i = 1; i <= n; i++) {
				int bank = scan.nextInt();
				int owes = scan.nextInt();
				int cash = scan.nextInt();
				
				banks[bank] -= cash;
				banks[owes] += cash;
			}
			for (int i = 1; i <= b; i++) {
				if (banks[i] < 0) {
					bail = "N";
				}
			}
			System.out.println(bail);
			b = scan.nextInt();
			n = scan.nextInt();
		}
	}

}