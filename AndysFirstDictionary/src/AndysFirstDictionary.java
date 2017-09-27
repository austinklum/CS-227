import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class AndysFirstDictionary {

	public static void main(String[] args) throws FileNotFoundException {
		//Scanner scan = new Scanner(new File("Disneyland.txt")).useDelimiter("[^a-zA-Z]");
		Scanner scan = new Scanner(System.in).useDelimiter("[^a-zA-Z]");
		HashSet<String> set = new HashSet<>();
		while(scan.hasNext()) {
			String word = scan.next().toLowerCase().replaceAll("[^a-z]","");
			if(word.length() > 0) {
				set.add(word);
			}
		}
		String[] arr = set.toArray(new String[set.size()]);
		Arrays.sort(arr);
		for(String word : arr) {
			System.out.println(word);
		}
		
	}

}
