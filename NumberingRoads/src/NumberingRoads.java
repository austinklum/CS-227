import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class NumberingRoads {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner scan = new Scanner(System.in);
		//Scanner scan = new Scanner(new File("input.txt"));
		//26 * ints < roads = impossible 
		int r, n, caseCount = 0;
		while((r = scan.nextInt()) != 0 && (n = scan.nextInt()) != 0) {
			caseCount++;
			int remainder = r/n;
			//System.out.println("Remainder = " + remainder);
			if(remainder > 27) {
				System.out.println("Case " + caseCount + ": impossible");
			}else {
				System.out.println("Case " + caseCount +":" + remainder);
			}
			
			// 8 / 5 -1
			//int i;
			/*for(i = 1; i < 28; i++) {
				System.out.printf("i = %d : n = %d : i*n = %d : r = %d\n",i,n,(i*n),r);
				if(i * n >= r) {
					System.out.println("Case " + caseCount + ": " + i);
					i = 0;
					break;
				}
			}
			if(n * i > r) {
				System.out.println("Case " + caseCount + ": impossible");
			}*/
		}
		
	}

}
