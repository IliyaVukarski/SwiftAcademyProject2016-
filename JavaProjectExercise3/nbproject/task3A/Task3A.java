package task3A;

public class Task3A {
	public static void main(String[] args) {
		int width = 5;
		int height = 5;
		for(int rows = 0; rows < width; rows++) {
			StringBuilder stringBuilder = new StringBuilder();
			stringBuilder.append("*");
			for(int columns = 2; columns < height; columns++) {
				if(rows == 0) {
					stringBuilder.append("*");
				}else if(rows == width - 1) {
					stringBuilder.append("*");
				}else {
					stringBuilder.append(" ");
				}
			}
			stringBuilder.append("*");
			System.out.println(stringBuilder);
		}
	}
}
