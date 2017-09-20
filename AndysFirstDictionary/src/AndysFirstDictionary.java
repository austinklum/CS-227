import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class AndysFirstDictionary {

	public static void main(String[] args) throws FileNotFoundException {
		//Scanner scan = new Scanner(new File("Disneyland.txt"));
		Scanner scan = new Scanner(System.in);
		HashSet<String> set = new HashSet<>();
		while(scan.hasNext()) {
			set.add(scan.next().toLowerCase().replaceAll("\\p{Punct}",""));
		}
		String[] arr = set.toArray(new String[set.size()]);
		Arrays.sort(arr);
		for(String word : arr) {
			System.out.println(word);
		}
		
	}

}
