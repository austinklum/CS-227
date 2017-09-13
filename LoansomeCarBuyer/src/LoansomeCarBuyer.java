import java.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @author Austin Klum
 *
 */
public class LoansomeCarBuyer {

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scan = new Scanner(System.in);
		//Scanner scan = new Scanner(new File("sampleInput.txt"));
		int durOfLoan = 0;
		
		//while(durOfLoan >= 0) {
			durOfLoan = scan.nextInt();
			double downPayment = scan.nextDouble();
			double loanAmt = scan.nextDouble();
			int depRecs = scan.nextInt();
			double monthlyPayment = loanAmt / durOfLoan;
			
			double[] rateArr = new double[depRecs + 1];
			int iter = 0;
			//collect rate data 
			while(iter < depRecs) {
				
				if(scan.nextInt() == iter) {
					 rateArr[iter] = scan.nextDouble();
				}else {
					//Use previous value
					//Possible edge case issue at first iteration...
					rateArr[iter] = rateArr[iter - 1];
				}
				iter++;
			}
			
			//Calculate car worth
			double rate = 0;
			double currentWorth = loanAmt + downPayment;
			for(int i = 0; i < durOfLoan; i++) {
				System.out.println("Month: " + i + " | Loan Amt: " + loanAmt + " | Car Value: " + currentWorth);
				if(i < rateArr.length) {
					rate = rateArr[i];
				}
				currentWorth = currentWorth * (1 - rate);
				loanAmt -= monthlyPayment;
				if(loanAmt <= currentWorth) {
					System.out.println((i + 1) + " Months");
					break;
				}
			}
		//}
		
	}

}
