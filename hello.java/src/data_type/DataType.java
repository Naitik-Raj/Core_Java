package data_type;

public class DataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byteDataType();
		shortDataType();
		intDataType();
		longDataType();
		
	}
	public static void byteDataType() {
		byte byteMaxVariable = Byte.MAX_VALUE;
		byte byteMinVariable = Byte.MIN_VALUE;
		
		System.out.println("Byte Max:" + byteMaxVariable + " Byte Min:" + byteMinVariable);
		
	}
	
	public static void shortDataType() {
		short shortMaxVariable = Short.MAX_VALUE;
		short shortMinVariable = Short.MIN_VALUE;
		
		System.out.println("Short Max:" + shortMaxVariable + " Short Min:" + shortMinVariable);
		
	}
	
	public static void intDataType() {
		int intMaxVariable = Integer.MAX_VALUE;
		int intMinVariable = Integer.MIN_VALUE;
		
		System.out.println("Int Max:" + intMaxVariable + " Int Min:" + intMinVariable);
		
	}
	public static void longDataType() {
		long longMaxVariable = Long.MAX_VALUE;
		long longMinVariable = Long.MIN_VALUE;
		
		System.out.println("Long Max:" + longMaxVariable + " Long Min:" + longMinVariable);
		
	}

}
