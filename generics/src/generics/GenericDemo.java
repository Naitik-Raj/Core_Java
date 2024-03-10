package generics;



public class GenericDemo {
	public static void main(String[] args) {
		GenericClass<Integer> intPrint = new GenericClass<>();
//		intPrint.printObject(10);
		//type safety
		GenericClass<String> strPrint = new GenericClass<>("ABC");
		strPrint.printObject("ABC");
		//no explicit casting needed
		int num = intPrint.getObj();
		
//		GenericClass<Student> stdPrint = new GenericClass<>(new Student(1,"Naitik"));
//		stdPrint.printObject(new Student(1,"Naitik"));
	}
}
