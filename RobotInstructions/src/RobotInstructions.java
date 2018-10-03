import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class RobotInstructions {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner scan = new Scanner(System.in);
		//Scanner scan = new Scanner(new File("input.txt"));
		
		int cases = scan.nextInt();
		int[] prev = new int[101];
		
		for (int i = 0; i < cases; i++) {
			int instur = scan.nextInt();
			scan.nextLine();
			int pos = 0;
			for (int j = 1; j < instur+ 1 ; j++) {
				String cmd = scan.nextLine();
				if("LEFT".equals(cmd)) {
					pos--;
					prev[j] = -1;
				} else if ("RIGHT".equals(cmd)) {
					pos++;
					prev[j] = 1;
				} else {
					String[] same = cmd.split(" ");
					prev[j] = prev[Integer.parseInt(same[2])];
					pos += prev[j] ;
				}
			}
			System.out.println(pos);
		}
		
	}

}