import java.util.Scanner;

public class RelationalOperators {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		int index = 0;
		while (index < t) {
			int n1 = scan.nextInt();
			int n2 = scan.nextInt();
			
			if (n1 > n2) {
				System.out.println(">");
			}else if (n1 < n2) {
				System.out.println("<");
			}else {
				System.out.println("=");
			}
			index++;
		}

	}

}
