import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PreorderTraversal {

	public static void main(String[] args) throws FileNotFoundException {
		//Scanner scan = new Scanner(System.in);
		Scanner scan = new Scanner(new File("input.txt"));
		
		while(scan.hasNext()) {
			boolean isValid = true;
			int parent = scan.nextInt();
			int next = 0;
			int left = 0;
			int right = 0;
			
			while((left = scan.nextInt()) <= 0 || (right = scan.nextInt()) <= 0) {
				if (parent <= left) {
					isValid = false;
				} else if (parent >= right) {
					isValid = false;
				}
				//Check left sub tree
				//parent = left;
				//check(parent,newleft, newright);
				//Check right sub tree
			}
				
			BinarySearchTree<Integer> tree = new BinarySearchTree<>();
			
		}
		
	}
	
}

