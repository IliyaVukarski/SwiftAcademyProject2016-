package task4;

public class MainTest {

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		final String message = "END";
		do {
			 calculator.operations();
		}while(message != "END");

	}

}
