package task3C;

public class Task3C {

	public static void main(String[] args) {
		for(int rows = 0; rows < 5; rows++) {
			for(int whiteSpace = 0; whiteSpace < 5 - rows; whiteSpace++) {
			    System.out.print(" ");
			}
			for(int symbol = 0; symbol < (2 * rows + 1); symbol++) {
				System.out.print("*");  
			}
			System.out.println();
		}
		
		for(int rows = 0; rows < 1; rows++){
			for(int whiteSpace = 0; whiteSpace < 5; whiteSpace++) {
				System.out.print(" ");
			}
			for(int symbol = 1; symbol < 2; symbol++){
				System.out.println("*");
			}
		}
		
		for(int rows = 1; rows <= 1; rows++) {
			for(int whiteSpace = 0; whiteSpace < 5 - rows; whiteSpace++) {
			    System.out.print(" ");
			}
			for(int symbol = 0; symbol < (2 * rows + 1); symbol++) {
				System.out.print("*");  
			}
			System.out.println();
		}
	}
}
