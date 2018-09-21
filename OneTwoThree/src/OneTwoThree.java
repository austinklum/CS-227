import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class OneTwoThree {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner scan = new Scanner(System.in);
		//Scanner scan = new Scanner(new File("input.txt"));
		
		for(int i = scan.nextInt(); i > 0; i--) {
			String str = scan.next();
			if (str.length() == 5) {
				System.out.println("3");
				continue;
			}
			int oneCount = 0;
			int twoCount = 0;
			
			switch (str.charAt(0)) {
				case 'o':
					oneCount++;
					break;
				case 't':
					twoCount++;
					break;
			}
			
			switch (str.charAt(1)) {
				case 'n':
					oneCount++;
					break;
				case 'w':
					twoCount++;
					break;
			}
			
			switch (str.charAt(2)) {
				case 'e':
					oneCount++;
					break;
				case 'o':
					twoCount++;
					break;
			}
			
			if(oneCount > twoCount) {
				System.out.println("1");
			} else {
				System.out.println("2");
			}
			
		}
	}

}