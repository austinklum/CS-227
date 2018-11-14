import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Perfection {

	public static void main(String[] args) throws FileNotFoundException {
		//Scanner scan = new Scanner(System.in);
		Scanner scan = new Scanner(new File("input.txt"));
		int num = scan.nextInt();
		System.out.println("PERFECTION OUTPUT");
		while(num != 0) {
			if(num == 1) {
				System.out.printf("%5d  DEFICIENT\n",num);
				num = scan.nextInt();
				continue;
			}
			int div = 1;
			for(int i = 2; i <= (num + 1)/2; i++) {
				if(num % i == 0) {
					div += i;
				}
			}
			int out = num - div;
			if (out < 0) {
				System.out.printf("%5d  ABUNDANT\n",num);
			} else if (out > 0) {
				System.out.printf("%5d  DEFICIENT\n",num);
			} else {
				System.out.printf("%5d  PERFECT\n",num);
			}
			num = scan.nextInt();
		}
		System.out.println("END OF OUTPUT");
	}

}