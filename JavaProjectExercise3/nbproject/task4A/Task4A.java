package task4A;

public class Task4A {

	public static void main(String[] args) {
		String text = "Peter loves dogs";
		char[] message = text.toCharArray();
		String newText = "";
		for(char ch : message) {
			switch(ch) {
			case 'a':
				break;
			case 'o':
				break;
			case 'e':
				break;
			default:
				newText = newText + ch;
			}
		}
		System.out.println(newText);
	}
}
