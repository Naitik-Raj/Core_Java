package abstraction.arithmeticoperation;

public class AbstractionDemo {
	public static void main(String... args) {
		//parent class
		//we can't create object of abstract class only concrete class can make object.
//		ArithmeticOperation absOp = new ArithmeticOperation();
		
		//child class
		AbstractArithmeticOperation absAritOp = new AbstractArithmeticOperation();
		absAritOp.setNum1(10);
		absAritOp.setNum2(20);
		
		System.out.println(absAritOp.add());
	}
}
