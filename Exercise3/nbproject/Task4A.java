package task4a;
import java.util.Scanner;

public class Task4A {
	public static void main(String[] args) {
		String text = "Peter loves dogs. He doesn’t like cats. Maria likes cats";
		String[] lines = text.split("\\.");
		for(int index = 0; index < lines.length; index++) {
			System.out.println(lines[index]);
		}
	}
}	
