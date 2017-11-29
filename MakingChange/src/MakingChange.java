import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class MakingChange {

	public static void main(String[] args) throws FileNotFoundException {
		//Scanner scan = new Scanner(System.in);
		Scanner scan = new Scanner(new File("input.txt"));
		int types = scan.nextInt();
		double[] cVals = new double[types]; 
		for(int i = 0; i < types; i++) {
			cVals[i] = scan.nextDouble();
		}
		Arrays.sort(cVals);
		for (double d : cVals) {
			System.out.println(d);
		}
		double change = scan.nextDouble();
		int i = 0;
		int used = 0;
		while(change > 0) {
			i = 0;
			System.out.printf("%2d : %f : %f\n",i,change,cVals[i]);
			 while ( change % cVals[i] == change) {
				 i++;
			 }
			 change /= cVals[i];
			 used++;
			 System.out.println("Used another! " + used);
		}
		System.out.println(used);
	}

}