package task1A;

public class Task1A {

	public static void main(String[] args) {
		int x = 5; 
		int y = 10; 
		int z = ++x * y--;	
		System.out.println(x); // 10
		System.out.println(y); // 9
		System.out.println(z); // 60

	}

}
