package task3;

public class Task3 {

	public static void main(String[] args) {
		int numA = 3291;
		int numB = 88581;
		int numC = 14;
		int numD = 1116;
		int numE = 171;
		int numF = 5;
		int numG = 312;
		int numH = 4;
		int numI = 18;
		int expressionOne = ((numA + numB) / numC);
		int expressionTwo = ((numD % numE) * numF);
		int expressionThree = (numG / (numH + numI));
		int expression = expressionOne + expressionTwo - expressionThree;
		System.out.println(expression);

	}

}
