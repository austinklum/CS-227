import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class JungleRoads {

	public static void main(String[] args) throws FileNotFoundException {
		//Scanner scan = new Scanner(System.in);
		HashMap<String, Vertex> map = new HashMap<>();
		Scanner scan = new Scanner(new File("input.txt"));
		int villages = scan.nextInt();
		while(villages > 0) {
			for(int i = 0; i < villages; i++) {
				Vertex village = new Vertex(scan.next(),scan.nextInt());
				for(int j = 0; j < village.numberOfEdges; j++) {
					Edge edge = new Edge();
				}
			}
		}
	}

	private static class Vertex {
		public String name;
		public ArrayList<Edge> edges;
		int numberOfEdges;
		
		public Vertex(String name, int numberOfEdges){
			this.name = name;
			this.numberOfEdges = numberOfEdges;
			edges = new ArrayList<>(numberOfEdges);
			
		}
	}
	
	private static class Edge {
		Vertex start, end;
		public int cost;
		
		public Edge(Vertex int end, int cost) {
			
		}
		
	}
	
}