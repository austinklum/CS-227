import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class LumberjackSeq {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner scan = new Scanner(System.in);
		//Scanner scan = new Scanner(new File("input.txt"));
		int cases = scan.nextInt();
		System.out.println("Lumberjacks:");
		for (int i = 0; i < cases; i++) {
			int prev = scan.nextInt();
			boolean isShortest = true;
			boolean isLongest = true;
			for (int j = 1; j < 10; j++) {
				int next = scan.nextInt();
				if(prev < next && isLongest) {
					isLongest = false;
				} else if (prev > next && isShortest) {
					isShortest = false;
				}
				prev = next;
			}
			if(isLongest || isShortest) {
				System.out.println("Ordered");
			} else {
				System.out.println("Unordered");
			}
		}
	}

}