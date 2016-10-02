package task3b;

import java.util.Arrays;
import java.util.Scanner;

public class Task3B {

	public static void main(String[] args) {
		System.out.println("Enter 5");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		char[][] fillArr = new char[number][number];
		for(char[] a : fillArr) {
			Arrays.fill(a, '*');
		}
		
		for(int rows = 0; rows < fillArr.length; rows++) {
			for(int columns = 0; columns < fillArr[rows].length; columns++) {
				if((rows == 1 || rows == 2 || rows == 3 ) && (columns == 0 || columns == 1 || columns == 2 || columns == 3 || columns == 4 ) && (rows + columns !=4)){
					System.out.print(" ");
					continue;
				}
				
				System.out.print(fillArr[rows][columns]);
			}
			System.out.println();
		}	
	}

}
