package ifstatement;

public class IfStatementDemo {

	public static void main(String[] args) {
		boolean isValid = true;
		if (isValid) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}

		int marks = 69;
		if (marks > 100) {
			System.out.println("Please Enter value in between 0 to 100.");
		} else if (marks >= 90 && marks <= 100) {
			System.out.println("Grade A.");

		} else if (marks >= 80 && marks < 90) {
			System.out.println("Grade B.");

		} else if (marks >= 70 && marks < 80) {
			System.out.println("Grade C.");

		} else {
			System.out.println("Failed...");
		}

		char ch = '7';
//		switch (ch) {
//		case '1':
//			System.out.print("Monday");
//			break;
//		case '2':
//			System.out.print("Tuesday");
//			break;
//		case '3':
//			System.out.print("Wednesday");
//			break;
//		case '4':
//			System.out.print("Thursday");
//			break;
//		case '5':
//			System.out.print("Friday");
//			break;
//		case '6':
//			System.out.print("Saturday");
//			break;
//		case '7':
//			System.out.print("Sunday");
//			break;
//		default: System.out.println("Monday");

//		}
		// after java 8
		switch (ch) {
		case '1' -> System.out.println("Monday");
		case '7' -> System.out.println("Sunday");
		default -> System.out.println("Invalid Input!");
		}
		
		int num1 = 10;
		int num2 = 30;
		int num3 = 20;
		
		int greatest = (num1 > num2) ? ((num1>num3) ? num1 : num3) : ((num2 > num3) ? num2 : num3);
		System.out.println(greatest);
	}

}
