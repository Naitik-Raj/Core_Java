package main;

import pojos.Students;

public class MainStudent {

	public static void main(String[] args) {
		Students student = new Students();
		Students student1 = new Students(1, "Naitik", 21);
		student.constructorProperties();
		student1.constructorProperties();
		
	}

}
