import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ComboLock {

	public static void main(String[] args) throws FileNotFoundException {
		//Scanner scan = new Scanner(System.in);
		Scanner scan = new Scanner(new File("input.txt"));
		
		String str = scan.nextLine();
		while(!str.equals("0 0 0 0")) {
			int ticks = 120;
			String[] combo = str.split(" ");
			
			int start = Integer.parseInt(combo[0]);
			int one = Integer.parseInt(combo[1]);
			int two = Integer.parseInt(combo[2]);
			int three = Integer.parseInt(combo[3]);
			
			int diff = one - start;
			
			if(diff < 0) {
				diff = 40 - start;
			}
			System.out.println("diff between start and one: " + diff);
			ticks += diff;
			
			diff = one - two;
			if (diff < 0) {
				diff = 40 - one;
			}
			System.out.println("diff between two and one: " + diff);
			ticks += diff;
			
			diff = three - two;
			if (diff < 0) {
				diff = 40 - two;
			}
			
			ticks += diff;
			
			System.out.println("diff between three and two: " + diff);
			System.out.println("totTicks: " + ticks);
			System.out.println(ticks * 9);
			str = scan.nextLine();
			if (str == "0 0 0 0") {
				System.out.println("yeah boi");
			}
		}
		
	}

}

