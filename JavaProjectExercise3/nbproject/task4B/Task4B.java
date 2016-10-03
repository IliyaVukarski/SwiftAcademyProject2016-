package task4B;

public class Task4B {
	public static void main(String[] args) {
		String text = "Peter loves dogs";
		char[] message = text.toCharArray();
		int count = 0;
		for(int index = 0; index < message.length; index++) {
			if(message[index] == ' ') {
				count++;
			} 
		}
		System.out.println(count);
	}
}
