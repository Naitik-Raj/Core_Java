package staticdemo;

import staticdemo.student.Student;

public class StaticDemo {
	int num1;
	static int num;
	
	public StaticDemo() {
		num1 = 10;
		num = 10;
	}
	public static void main(String[] args) {
//		System.out.println(num);
//		
//		StaticDemo staticDemo = new StaticDemo();
//		
//		staticDemo.dispNum();
		
		Student raj = new Student();
//		raj.setCollegeName("Arya");
		raj.setName("Naitik");
		raj.setRollNo(100);
		
		System.out.println(raj.getCollegeName());
	}
	
	public void dispNum() {
		System.out.println(num);
	}

}
