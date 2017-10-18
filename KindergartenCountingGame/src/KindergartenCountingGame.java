import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class KindergartenCountingGame {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner scan = new Scanner(System.in);
		//Scanner scan = new Scanner(new File("input.txt"));
		while(scan.hasNextLine()) {
			System.out.println(scan.nextLine().replaceAll("[^a-zA-Z\\s]", " ").replaceAll("^ +| +$|( )+", " ").trim().split(" ").length);
		}
	}

}
