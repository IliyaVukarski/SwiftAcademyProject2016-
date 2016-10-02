package task4c;

public class Task4C {

	public static void main(String[] args) {
		String text = "Helen has 3 dogs and 11 cats";
		String[] digitsInString = text.split(" ");
		int sum = 0;
		int temp = 0;
		for(int index = 0; index < digitsInString.length; index++) {
			try {
				temp = Integer.parseInt(digitsInString[index]);
				sum = sum + temp;
			}catch(Exception ex) {
				
			}
		}
		System.out.println(sum);	
	}
}
