import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class AutomaticAnswer {

	public static void main(String[] args) throws FileNotFoundException {
		//Scanner scan = new Scanner(System.in);
		Scanner scan = new Scanner(new File("input.txt"));
		int cases = scan.nextInt();
		for (int i = 0; i < cases; i++) {
			String result = Integer.toString((((((scan.nextInt()*567)/9)+7492)*235)/47)-498);
			System.out.println(result.charAt(result.length()-2));
		}
	}

}