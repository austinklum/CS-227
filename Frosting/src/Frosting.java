/*
 * UVA 13291 Frosting on the Cake
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Frosting {

	public static void main(String[] args) throws FileNotFoundException {
		//Scanner scan = new Scanner(System.in);
		Scanner scan = new Scanner(new File("input.txt"));
		int len = scan.nextInt();
		int white = 0;
		int pink = 0;
		int yellow = 0;
		int[][] arr = new int[len][len];
		
		for (int i = 0; i < len; i++) {
				arr[i][0] = scan.nextInt();
		}
		
		for (int i = 0; i < len; i++) {
			arr[i][1] = scan.nextInt();
	}
		
		for (int i = 0; i < len; i++) {
			System.out.println(arr[i][0] + " " + arr[i][1]);
			switch(i % 3) {
				case 0: 
					white += arr[i][0]*arr[i][1];
					break;
				case 1:
					pink += arr[i][0]*arr[i][1];
					break;
				case 2:
					yellow += arr[i][0]*arr[i][1];
					break;
			}
		}
		System.out.printf("%d %d %d",white,pink,yellow);
	}

}
