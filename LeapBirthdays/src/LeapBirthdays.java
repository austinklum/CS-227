import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LeapBirthdays {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner scan = new Scanner(System.in);
		//Scanner scan = new Scanner(new File("input.txt"));
		int lim = scan.nextInt();
		for (int i = 1; i <= lim; i++) {
			int day = scan.nextInt();
			int month = scan.nextInt();
			int year = scan.nextInt();
			int qy = scan.nextInt();
			int birthdays = 0;
			for (int j = year + 1; j <= qy; j++) {
				if(!(month == 2 && day == 29)) {
					birthdays++;
				} else if(isLeapYear(j)){
					birthdays++;
				}
			}
			System.out.println("Case " + i + ": " + birthdays);
		}
	}
	public static boolean isLeapYear(int year) {
		if (year % 400 == 0) return true;
		if (year % 100 == 0) return false;
		if (year % 4 == 0) return true;
		return false;
	}
}