import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BasicallySpeaking {

	public static void main(String[] args) throws FileNotFoundException {
		//Scanner scan = new Scanner(System.in);
		Scanner scan = new Scanner(new File("input.txt"));
		while(scan.hasNext()) {
			String str = "";
			for( char c : scan.next().toCharArray()) {
				if(c != ' ') {
					str += c;
				}
			}
			int from = scan.nextInt();
			int to   = scan.nextInt();
			
			System.out.println(Integer.toString(Integer.parseInt(str, from), to).toUpperCase());
		}
	}

}