import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * 
 * @author Austin Klum
 * CM Contest Problem Archive 299 Train Swapping
 * 2019/03/06
 * 
 */

public class TrainSwapping {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scan = new Scanner(System.in);
		//Scanner scan = new Scanner(new File("in"));
		int n = scan.nextInt();
		for(int k = 0; k < n; k++) {
			int lengthOfTrain = scan.nextInt();
			int[] arr = new int[lengthOfTrain];
			int swaps = 0;
			
			//Fill Array
			for(int i = 0; i < lengthOfTrain; i++) {
				arr[i] = scan.nextInt();
			}
			
			//Bubble Sort Array. Keep track of swaps.
			for(int i = 0; i < lengthOfTrain; i++) {
				for (int j = 0; j < lengthOfTrain-i-1; j++) {
					if (arr[j] > arr[j+1]) { 
						//Swap arr[j+1] and arr[i] 
	                    int temp = arr[j]; 
	                    arr[j] = arr[j+1]; 
	                    arr[j+1] = temp; 
	                    swaps++;
					}
				}
			}
			
			System.out.println("Optimal train swapping takes " + swaps + " swaps.");
		}
	}
}
