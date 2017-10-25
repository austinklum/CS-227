import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Server {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner scan = new Scanner(System.in);
		//Scanner scan = new Scanner(new File("input.txt"));
		int count = 0;
		while(scan.hasNext()) {
			count++;
			boolean endEarly = false;
			int cases = scan.nextInt();
			int time = scan.nextInt();
			int tasks  = 0;
			int i = 0;
			int iter = 0;
			//System.out.printf("Cases: %3d | time: %3d\n", cases, time);
			for(i = 0; i < cases; i++) {
				tasks += scan.nextInt();
				//System.out.printf("tasks: %3d | endEarly = %b\n", tasks, endEarly);
				if (tasks > time && endEarly == false) {
					iter = i;
					endEarly = true;
				}
			}
			if(endEarly) {
				System.out.println("Case " + count + ": " + iter);
			}else {
				System.out.println("Case " + count + ": " + i);
			}
			
		}
		
	}

}