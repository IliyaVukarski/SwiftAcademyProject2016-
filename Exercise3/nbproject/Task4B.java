package task4b;

public class Task4B {

	public static void main(String[] args) {
		String text = "Peter loves dogs. He doesn’t like cats. Maria likes cats.";
		String[] lines = text.split("\\.");
		for(String line : lines) {
			System.out.println(line + ".");
		}	
	}
}
