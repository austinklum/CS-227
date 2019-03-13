import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * 
 * @author Austin Klum
 * UVA 12157 Tariff Plan
 * 2019/03/13
 * 
 */

public class TariffPlan {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scan = new Scanner(System.in);
		//Scanner scan = new Scanner(new File("in"));
		int t = scan.nextInt();
		for (int c = 0; c < t; c++) {
			int n = scan.nextInt();
			int miles = 0;
			int juice = 0;
			for (int i = 0; i < n; i++) {
				int time = scan.nextInt();
				int divided = (time / 30) + 1;
				miles += divided * 10;
				juice += (divided+1)/2 * 15;
			}
			System.out.print("Case " + (c + 1) + ": ");
			int min = miles;
			if(miles <= juice) {
				System.out.print("Mile ");
			}
			if (juice <= miles) {
				System.out.print("Juice ");
				min = juice;
			}
			System.out.println(min);
		}
	}
}
