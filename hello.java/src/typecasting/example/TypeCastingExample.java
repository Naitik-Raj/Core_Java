package typecasting.example;

import typecasting.TypeCasting;

public class TypeCastingExample {

	public static void main(String[] args) {
		// Widening or implicit type casting
		
				byte byteVariable = 10;
				short shortVariable = 20;
				
				TypeCasting typeCast = new TypeCasting(byteVariable, shortVariable, 30, 40l, 50.1f, 60.2, 'A', true);
				
				typeCast.widening();
				typeCast.narrowing();

	}

}
