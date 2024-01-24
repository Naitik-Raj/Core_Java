package typecasting;

public class TypeCasting {
	byte byteVariable;
	short shortVariable;
	int intVariable;
	long longVariable;

	float floatVariable;
	double doubleVariable;

	char charVariable;
	boolean boolVariable;

	public TypeCasting(byte byteVariable, short shortVariable, int intVariable, long longVariable, float floatVariable,
			double doubleVariable, char charVariable, boolean boolVariable) {
		this.byteVariable = byteVariable;
		this.shortVariable = shortVariable;
		this.intVariable = intVariable;
		this.longVariable = longVariable;

		this.floatVariable = floatVariable;
		this.doubleVariable = doubleVariable;

		this.charVariable = charVariable;
		this.boolVariable = boolVariable;
	}
	//implicit conversion
	public void widening() {
		shortVariable = byteVariable;
		System.out.println(shortVariable);
		
		intVariable = shortVariable;
		System.out.println(intVariable);

		longVariable = intVariable;
		System.out.println(longVariable);

		floatVariable = intVariable;
		System.out.println(floatVariable);

		floatVariable = longVariable; //long->float implicit typeCasting
		System.out.println(floatVariable);
		
		//char 16bit byte 8bit; because of positive and negative number conversion
//		charVariable = shortVariable;
//		charVariable = byteVariable;
//		charVariable = intVariable;

		//cannot convert implicitly coz of size
//		byteVariable = charVariable;
//		shortVariable = charVariable;
		
		intVariable = charVariable;
		System.out.println(intVariable);
		
		longVariable = charVariable;
		System.out.println(longVariable);
		
		floatVariable = charVariable;
		System.out.println(floatVariable);
		
		doubleVariable = charVariable;
		System.out.println(doubleVariable);
		
		
	}
	//explicit conversion
	public void narrowing() {
		byteVariable = (byte) shortVariable;
		System.out.println(byteVariable);
		longVariable = (long) floatVariable;
		System.out.println(longVariable);
		charVariable = (char) byteVariable;
		System.out.println(charVariable);
	}
	
	public float expressionPromotion(int intVariable) {
//		intVariable = (int) (intVariable + floatVariable);
//		
//		longVariable = shortVariable + intVariable;
		return (intVariable + floatVariable);
	}
}
