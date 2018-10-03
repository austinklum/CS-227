import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.Scanner;

public class PalindromicPrimeNumber {

	public static void main(String[] args) throws FileNotFoundException {
		//Scanner scan = new Scanner(System.in);
		Scanner scan = new Scanner(new File("input.txt"));
		
		int cases = scan.nextInt();
		
		for (int i = 0; i < cases; i++) {
			BigInteger big = new BigInteger(scan.next());
			BigInteger[] ppm = BigInteger.ONE.divideAndRemainder(big);
			
			System.out.println();
		}
	}

}