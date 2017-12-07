import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Sokoban {
	private static String[][] arr;
	private static int workerRow;
	private static int workerCol;
	public static void main(String[] args) throws FileNotFoundException {
		//Scanner scan = new Scanner(System.in);
		Scanner scan = new Scanner(new File("input.txt"));
		
		int rows = scan.nextInt(); 
		int cols = scan.nextInt();
		System.out.println("rows = " + rows + " : " + "cols = " + cols);
		while(rows != 0 && cols != 0) {
			arr = new String[rows][cols];
			for (int i = 0; i < arr.length; i++) {
				String tmp[] = scan.next().split("");
				for (int j = 0; j < arr[i].length; j++) {
					arr[i][j] = tmp[j];
				}
			}
			for(char c : scan.next().toCharArray()) {
				move(c);
			}
			for (int i = 0; i < arr.length; i++) {
				System.out.println();
				for (int j = 0; j < arr[i].length; j++) {
					System.out.print(arr[i][j]);
				}
			}
			
			rows = scan.nextInt();
			cols = scan.nextInt();
					
		}
	}
	public static void move(char c) {
		switch (c) {
		case 'U':
			up();
			return;
		case 'D':
			down();
			return;
		case 'L':
			left();
			return;
		case 'R':
			right();
			return;
		}
	}
	
	public static void up() {
		if(canMove(0,-1)) {
			//Grab thing above me put it below me
			String tmp = arr[workerRow][workerCol-1];
			
		}
	}
	
	public static void down() {
		if(canMove(0,1)) {
			
		}
	}
	
	public static void left() {
		if(canMove(-1,0)) {
			
		}
	}
	
	public static void right() {
		if(canMove(1,0)) {
			
		}
	}
	
	public static boolean canMove(int row, int col) {
		switch (arr[row + workerRow][col + workerCol].charAt(0)) {
		case '#':
			return false;
		case 'b':
		case 'B':
				if(arr[row + workerRow + row][col + workerCol + col].equals(".") || arr[row + workerRow + row][col + workerCol + col].equals("+")) {
					swap(row,col);
				}
		default:
			swap(row,col);
		}
	}
	public static void swap(int row,int col) {
		
	}
}