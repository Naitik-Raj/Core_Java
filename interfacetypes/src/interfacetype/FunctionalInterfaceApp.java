package interfacetype;

import interfacetypes.functional.*;

public class FunctionalInterfaceApp {

	public static void main(String[] args) {
		ArithmeticOperation addition = new Addition();
		int result = addition.operation(10, 20);
		System.out.println(result);
		
		//polymorphism
//		addition = new Subtraction();
		ArithmeticOperation subtraction = new Subtraction();
		System.out.println(subtraction.operation(10, 20));
		
		//anonymous class
		ArithmeticOperation multiplication = new ArithmeticOperation() {
			@Override
			public int operation(int num1, int num2) {
				return num1*num2;
			}
		};
		System.out.println(multiplication.operation(10,20));
		
		//lambda expression
		ArithmeticOperation division = (int num1, int num2) -> num2/num1;
		System.out.println(division.operation(10, 20));
	}

}
