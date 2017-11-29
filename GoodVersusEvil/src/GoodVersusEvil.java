import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class GoodVersusEvil {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner scan = new Scanner(System.in);
		//Scanner scan = new Scanner(new File("input.txt"));
		int numBattles = scan.nextInt();
		
		int[] goodPnts = {1,2,3,3,4,10};
		int[] evilPnts = {1,2,2,2,3,5,11};
		for(int j = 0; j < numBattles; j++) {
			int good = 0;
			int evil = 0;
			for(int i = 0; i < goodPnts.length; i++) {
				good += goodPnts[i] * scan.nextInt();
			}
			for(int i = 0; i < evilPnts.length; i++) {
				evil += evilPnts[i] * scan.nextInt();
			}
			String str = "Battle " + (j+1) + ": ";
			if(good == evil) {
				System.out.println(str + "No victor on this battle field");
			} else if (good < evil) {
				System.out.println(str + "Evil eradicates all trace of Good");
			} else {
				System.out.println(str + "Good triumphs over Evil");
			}
			
		}
	}

}