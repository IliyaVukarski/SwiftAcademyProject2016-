package task4C;

public class Task4C {

	public static void main(String[] args) {
		String text = 
				"Peter loves dogs. He doesn’t like cats. Maria likes cats";
		String[] sentences = text.split("\\.|\\?|\\!");
		for(int index = 0; index< sentences.length; index++) {
			System.out.println(sentences[index] + ".");
		}

	}

}
