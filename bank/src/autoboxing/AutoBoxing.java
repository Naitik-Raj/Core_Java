package autoboxing;

public class AutoBoxing {
	public static void main(String[] args) {
		String msg = "10";
		//wrapper classes is immutable
		Integer num = new Integer("10");
		//SCP/SLP
		Integer num1 = 10;
		num1 = 20;
		System.out.println(num1);
	}
}
