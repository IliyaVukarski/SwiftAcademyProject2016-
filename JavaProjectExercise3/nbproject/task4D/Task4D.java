package task4D;

import java.util.ArrayList;
import java.util.List;

public class Task4D {

	public static void main(String[] args) {
		String inputString = "Helen has 3 dogs and 11cats";
		String digitString = "";
		int sum = 0;
		List<Integer> listDigits = new ArrayList<>();
		for(int index = 0; index < inputString.length(); index++) {
			if(Character.isDigit(inputString.charAt(index))) {
				digitString = digitString + inputString.charAt(index);
			}else {
				if(!digitString.isEmpty()) {
					listDigits.add(Integer.parseInt(digitString));
					digitString = "";
				}
			}
		}
		
		for(Integer number : listDigits) {
			sum = sum + number;
		}
		System.out.println(sum);
	}

}
