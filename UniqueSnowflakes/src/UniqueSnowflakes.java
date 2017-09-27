import java.util.HashSet;
import java.util.Scanner;

public class UniqueSnowflakes {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int cases = scan.nextInt();
		HashSet<Long> set = new HashSet<>();
		
		for(int i = 0; i < cases; i++) {
			long max = 0;
			int iter = scan.nextInt();
			for(int j = 0; j < iter; j++) {
				Long snowflake = scan.nextLong();
				if(set.contains(snowflake)) {
					if( max < set.size()) {
						max = set.size();
					}
					set = new HashSet<>();
				} else {
					set.add(snowflake);
				}
			}
			if(max < set.size()) {
				max = set.size();
			}
			System.out.println(max);
		}
	}

}
