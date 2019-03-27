import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WineTrading {
	public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(System.in);
	//	Scanner scan = new Scanner(new File("in"));
		
		int next = scan.nextInt();
		while(next > 0) {
			long total = 0;
			long work = 0;
			for (int i = 0; i < next; i++) {
                total += scan.nextInt();
                if(total < 0){
                    work -= total;
                } else {
                    work += total;
                }
			}
			System.out.println(work);
			next = scan.nextInt();
		}
	}
}
