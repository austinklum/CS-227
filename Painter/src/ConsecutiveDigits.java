import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ConsecutiveDigits {
	public static void main(String[] args) throws FileNotFoundException {
		//Scanner scan = new Scanner(System.in);
		Scanner scan = new Scanner(new File("in"));
		int t = scan.nextInt();
		for(int i = 0; i < t;i++) {
			int num = scan.nextInt();
			int denom = scan.nextInt();
			int from = scan.nextInt();
			int to = scan.nextInt();
			printf("Problem set %d: %d / %d, base 7 digits %d through %d: %f\n",
					i+1,
					num,
					denom,
					
					Integer.toString(num, 7);
		}
	}
}
