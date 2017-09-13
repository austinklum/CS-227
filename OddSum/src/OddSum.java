import java.util.Scanner;

public class OddSum {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int iter = scan.nextInt();
		int index = 0;
		while(index < iter) {
			index++;
			int total = 0;
			int a = scan.nextInt();
			int b = scan.nextInt();
			for(int i = a; i <= b; i++) {
				if((i % 2) == 1) {
					//Its Odd
					total += i;
				}
			}
			System.out.println("Case " + index + ": " + total );
			total = 0;
		}
	}
	
}
