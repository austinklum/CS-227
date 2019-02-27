import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


/* 
 * ACM 11044 Searching for Nessy
 * Austin Klum
 * 2019/02/27
 */

public class LochNess {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scan = new Scanner(System.in);
		//Scanner scan = new Scanner(new File("in"));
		int t = scan.nextInt();
		
		for(int i = 0; i < t;i++) {
			int rows = scan.nextInt();
			int cols = scan.nextInt();
			
			System.out.println((int)Math.ceil((rows/3) * (cols/3)));
		}
	}
}
