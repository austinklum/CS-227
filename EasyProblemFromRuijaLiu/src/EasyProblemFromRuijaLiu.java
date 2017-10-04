import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class EasyProblemFromRuijaLiu {

	public static void main(String[] args) throws FileNotFoundException {
		//Scanner scan = new Scanner(System.in);
		Scanner scan = new Scanner(new File("input.txt"));
		while(scan.hasNext()) {
			int elementsInArray = scan.nextInt();
			int numberOfQueries = scan.nextInt();
			
			HashMap<Integer, ArrayList<Integer>> hash = new HashMap<>();
			
			for(int i = 1; i <= elementsInArray;i++) {
				Integer key = scan.nextInt();
				
				if(!hash.containsKey(key)) {
					 hash.put(key, new ArrayList<Integer>());
				}
				hash.get(key).add(i);
			}
			
			for(int i = 0; i < numberOfQueries; i++) {
				int k = scan.nextInt();
				int key = scan.nextInt();
				if(!hash.containsKey(key)) {
					System.out.println("0");
				} else if(hash.get(key).size() < k){
					System.out.println("0");
				} else {
					System.out.println(hash.get(key).get(k - 1));
				}
			}
			
//			for(int i = 0; i < elementsInArray; i++) {
//				int key = scan.nextInt();
////				System.out.println("Origin Key = " + key);
//				ArrayList<Integer> arr = hash.get(key);
//				
//				if(hash.containsKey(key)) {
//				    arr.add(i + 1);
//				    hash.put(key, arr);
//				    System.out.println("Added " + key + " to the arraylist. Size = " + arr.size());
////				    System.out.println("Added to arrayList");
//				}else {
////					System.out.println("Initializing arraylist");
//					arr = new ArrayList<>();
//					arr.add(i + 1);
//					hash.put(key, arr);
//					  System.out.println("Created " + key + " to the arraylist. Size = " + arr.size());
//				}
//			}
//			
//			for (int i = 0; i < numberOfQueries; i++) {
//				int kthItem = scan.nextInt();
//				int key = scan.nextInt();
//				ArrayList<Integer> arr = hash.get(key);
//				System.out.println("Key = " + key);
//				System.out.println("KthItem = " + kthItem);
////				System.out.println("Contents of arrayList:");
//				arr.trimToSize();
//				if(hash.containsKey(key) && arr.size() > kthItem ) {
//					/*for(int j = 0; j < arr.size(); j++) {
//						System.out.println("\t" + arr.get(j));
//					}*/
//					System.out.println(arr.get(kthItem - 1));
//				} else {
//					System.out.println("NULL 0");
//				}
//				
//			}
//			
		}
		
	}

}
