import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class RFP {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scan = new Scanner(System.in);
		//Scanner scan = new Scanner(new File("in"));
		int n = scan.nextInt();
		int p = scan.nextInt();
		int count = 1;
		while((n+p)>0) {
			
			String bestCompany = "";
			double bestCompliance = 0;
			double bestOffer = Double.MAX_VALUE;
			
			for(int i = 0; i <= n; i++) {
				scan.nextLine();
			}
			
			for (int j = 0; j < p; j++) {
				String company = scan.nextLine();
				double offer = scan.nextDouble();
				int rMet = scan.nextInt();
				double compliance = (double)rMet/n;
				
				//System.out.printf("C: %s, O: %f, M:%d\n",company,offer,rMet);
				
				for(int i = 0; i <= rMet; i++) {
					scan.nextLine();
				}
				
				if(bestCompliance < compliance) {
					bestCompany = company;
					bestCompliance = compliance;
					bestOffer = offer;
				} else if (bestCompliance == compliance && offer < bestOffer) {
					bestCompany = company;
					bestCompliance = compliance;
					bestOffer = offer;
				}
			}

			System.out.println("RFP #" + count++);
			System.out.println(bestCompany);
			System.out.println();
			
			n = scan.nextInt();
			p = scan.nextInt();
		}
	}
}
