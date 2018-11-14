import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CountOnCantor {

	public static void main(String[] args) throws FileNotFoundException {
		//Scanner scan = new Scanner(System.in);
		int num, dem;
		Scanner scan = new Scanner(new File("input.txt"));
		int n = scan.nextInt();
		double d = Math.ceil((Math.sqrt(1+8*n)-1)/2);
		int m = (int) (n - d *((d-1)/2));
		if((d-1)%2 == 0) {
			num = m;
			dem = (int) (d - m);
		} else {
			num = (int) (d-m);
			dem = m;
		}
		System.out.println("TERM " + n + " IS " + num + "/" + dem);
	}

}