import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Pushups {

	public static void main(String[] args) throws FileNotFoundException {
		//Scanner scan = new Scanner(System.in);
		Scanner scan = new Scanner(new File("input.txt"));
		int numCases = scan.nextInt();
		
		for(int i = 0; i < numCases; i++) {
			int n = scan.nextInt();
			int m = scan.nextInt();
			int ways[] = new int[m];
			for(int j = 0; j < ways.length; j++) {
				ways[j] = scan.nextInt();
			}
			determineScore(ways);
		}
		
		
		
	}
	
	public static int determineScore(int[] ways) {
		return 0;
		
	}
	
}