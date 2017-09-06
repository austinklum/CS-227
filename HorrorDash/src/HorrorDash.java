import java.util.Scanner;

public class HorrorDash {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		int index = 0;
		while (index < t) {
			index++;
			int numStudents = scan.nextInt();
			int maxVal = 0;
			while (numStudents > 0) {
				numStudents--;
				int tempMax = scan.nextInt();
				
				if (tempMax > maxVal) {
					maxVal = tempMax;
				}
			}
			System.out.println("Case " + index + ": " + maxVal);
		}

	}

}
