import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
 * Problem E: Hangover
 * Austin Klum
 * 2019/02/20
 * */

public class Hangover {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scan = new Scanner(System.in);
		//Scanner scan = new Scanner(new File("in"));
		double c = scan.nextDouble();
		while(c > 0) {
			double len = 0;
			double n = 2;
			while(len < c) {
				len += (double)1/(n++);
			}
			System.out.println((int)n-2 + " card(s)");
			c = scan.nextDouble();
		}
	}
}
