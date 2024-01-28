package encapsulation;

import encapsulation.entity.Student;

public class MainStudent {
	public static void main(String[] args) {
		Student std1 = new Student();
		
		std1.setAge((byte)20);
		std1.setName("Naitik");
		std1.setRollNo(100);
		
		System.out.println(std1.getAge());
		System.out.println(std1.getName());
		System.out.println(std1.getRollNo());
		
		System.out.println(std1.toString());
	}
}
