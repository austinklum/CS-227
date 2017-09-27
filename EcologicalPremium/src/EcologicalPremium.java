import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class EcologicalPremium {

	public static void main(String[] args) throws FileNotFoundException {
		@SuppressWarnings("resource")
		//Scanner scan = new Scanner(new File("SampleInput.txt"));
		Scanner scan = new Scanner(System.in);
		
		int numCases = scan.nextInt();
		for(int i = 0; i < numCases; i++) {
			int farmers = scan.nextInt();
			int moneyRecieved = 0;
			for(int j = 0; j < farmers; j++) {
				int size = scan.nextInt(), animals = scan.nextInt(), evoFri = scan.nextInt();
				moneyRecieved += size * evoFri;
			}
			System.out.println(moneyRecieved);
		}
	}

}
