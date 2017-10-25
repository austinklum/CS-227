import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordIndex {

	public static void main(String[] args) throws FileNotFoundException {
		//Sacnner scan = new Scanner(System.in);
		Scanner scan = new Scanner(new File("input.txt"));
//		
//		outerLoop:
//		while(scan.hasNextLine()) {
//			String str = scan.nextLine();
//			//Check again invalid inputs
//			for(int i = 1; i < str.length(); i++) {
//				char max = str.charAt(0);
//				if(max >= str.charAt(i)) {
//					System.out.println("0");
//					break outerLoop;
//				}
//			}
//			int repeatCount = 0;
//			int total = 0;
//			int arr[] = {0,26,25,24};
//			for(int i = 0; i < str.length(); i++) {
//				int c = str.charAt(i) - 'a';
//				total += c + ( arr[i] * 26);
//				
//			}
			int total = 0;
			for(int j=3;j<=7;j++) {
				total += (j*3 - 3);
			}
			System.out.println(total);
	}

}
