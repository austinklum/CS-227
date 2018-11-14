import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ShatteredCake {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner scan = new Scanner(System.in);
		//Scanner scan = new Scanner(new File("input.txt"));
		int width = scan.nextInt();
		int n = scan.nextInt();
		
		int tot = 0;
		for (int i = 0; i < n; i++) {
			int w = scan.nextInt();
			int l = scan.nextInt();
			tot += w * l;
		}
		System.out.println(tot/width);
	}

}