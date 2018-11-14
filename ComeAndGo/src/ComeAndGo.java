import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public class ComeAndGo {

	public static void main(String[] args) throws FileNotFoundException {
		//Scanner scan = new Scanner(System.in);
		Scanner scan = new Scanner(new File("input.txt"));
	}


	private class Vertex {
		List<Edge> edges;		
	}
	
	private class Edge {
		Edge v;
		Edge w;
	}
}