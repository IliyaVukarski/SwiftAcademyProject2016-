package task3A;

public class Task3 {

	public static void main(String[] args) {
		int width = 5;
		int height = 5;
		for(int rows = 0; rows < width; rows++) {
			for(int columns = 0; columns < height; columns++) {
				if(rows == 0 || rows == width - 1 || columns == 0 || columns == height - 1) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
