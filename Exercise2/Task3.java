package task3;

public class Task3 {

	public static void main(String[] args) {
		int a = 3291;
		int b = 88581;
		int c = 14;
		int d = 1116;
		int e = 171;
		int f = 5;
		int g = 312;
		int h = 4;
		int i = 18;
		int partOne = ((a + b) / 14);
		int partTwo = ((1116 % 171) * 5);
		int partThree = (312 / (4 + 18));
		int expression = partOne + partTwo - partThree;
		System.out.println(expression);
	}
}
