import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LongNameShortDesc {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner scan = new Scanner(System.in);
		//Scanner scan = new Scanner(new File("input.txt"));
		int[] ans = {56,96,36,76,16};
		int cases = scan.nextInt();
		for (int i = 0; i < cases; i++) {
			String n = scan.next();
			if(n.equals("0")) {
				System.out.println(1);
			} else if (n.equals("1")) {
				System.out.println(66);
			} else if(n.length() <= 3){
				System.out.println(ans[(Integer.parseInt(n)-2)%5]);
			} else {
				System.out.println(ans[(Integer.parseInt(n.substring(n.length()-1, n.length()))-2)%5]);
			}
		}
	}

}