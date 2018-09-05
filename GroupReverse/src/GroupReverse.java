import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class GroupReverse {

	public static void main(String[] args) throws FileNotFoundException {
		//Scanner scan = new Scanner(System.in);
		Scanner scan = new Scanner(new File("input.txt"));
		int n = scan.nextInt();
		while(n != 0) {
			String str = scan.next();
			int b = 0;
			int e = n;
			while(e <= str.length()) {
				StringBuilder out = new StringBuilder();
				//System.out.println("b:" + b + " e:" + e + " " + str.substring(b, e));
		        out.append(str.substring(b, e));
		        System.out.print(out.reverse());
		        b = e;
		        e += n;
			}
			System.out.println();
			n = scan.nextInt();
		}
	}
}