import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MachinedSurfaces {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner scan = new Scanner(System.in);
		//Scanner scan = new Scanner(new File("input.txt"));
		int lim = Integer.parseInt(scan.nextLine());
		int[] spaces = new int[lim];
		
		while(lim != 0) {
			int min = 26;
			for(int i = 0; i < lim; i++) {
				String row = scan.nextLine();
				spaces[i] = row.lastIndexOf(' ') - row.indexOf(' ');
				if(spaces[i] < min) 
					min = spaces[i];
			}
			int sum = 0;
			for(int i = 0;i < lim; i++) 
				sum += spaces[i] - min;
			System.out.println(sum);
			lim = Integer.parseInt(scan.nextLine());
		}
	}
}