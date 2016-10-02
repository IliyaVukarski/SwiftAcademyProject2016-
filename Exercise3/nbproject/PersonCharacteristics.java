import java.util.Arrays;
import java.util.Scanner;

public class PersonCharacteristics {

	public static void main(String[] args) {
		/*
		char[][] fillArr = new char[5][5];
		for(char[] rows : fillArr) {
			Arrays.fill(rows, '*');
		}
		for(int rows = 0; rows < fillArr.length; rows++) {
			for(int columns = 0; columns < fillArr[rows].length; columns++) {
				if((rows == 1 || rows == 2 || rows == 3) && (columns == 1 || columns == 2 || columns == 3)){
					System.out.print(" ");
					continue;
				}
				System.out.print(fillArr[rows][columns]);
			}
			System.out.println();
		}
		*/
		/*
		for(int index = 0; index <=10; index++) {
			if(index % 2==0) {
				continue;
			}
			System.out.println(index);
		}
		*/
		
		
		char[][] fillArr = new char[5][5];
		for(char[] rows : fillArr) {
			Arrays.fill(rows, '*');
		}
		for(int rows = 0; rows < fillArr.length; rows++) {
			for(int columns = 0; columns < fillArr[rows].length; columns++) {
				if((rows == 1 || rows == 2 || rows == 3) && (columns == 0 ||columns == 1 || columns == 2 || columns == 3 || columns == 4 || columns == 5) && (rows+columns !=4)){
					System.out.print(" ");
					continue;
				}
				System.out.print(fillArr[rows][columns]);
			}
			System.out.println();
		}
	}
}