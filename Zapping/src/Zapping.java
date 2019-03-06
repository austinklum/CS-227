import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * 
 * @author Austin Klum
 * UVA: 12468 Zapping
 * 2019/03/06
 * 
 */

public class Zapping {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scan = new Scanner(System.in);
		//Scanner scan = new Scanner(new File("in"));
		int start = scan.nextInt();
		int end = scan.nextInt();
		int first = 0;
		int second = 0;
		while(start > -1 && end > -1) {
		    if (start > end) {
		    	first = start - end;
	            second = end + 100 - start;
	        } else {
	    	  first = end - start;
	    	  second = start + 100 - end;
	        }
		    System.out.println(Math.min(first, second));
			start = scan.nextInt();
			end = scan.nextInt();
		}
	}
}
