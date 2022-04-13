import java.util.*;
public class Grid {
	
	public static void printGrid(int x,int y) {
		for (int i = 0; i < y; i++) {
			System.out.println("");
			for (int j = 0; j < x; j++) {				
				System.out.print("- ");
			}
		}
	}
	
	public static void main(String[] args) {
		int x = 20;
		int y = 20;
		printGrid(x, y);
		
	}
}
