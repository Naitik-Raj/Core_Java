package pojos;

public class Students {
	int rollNo;
	String name;
	int age;

	public Students() {
	}

	// variable shadow
	public Students(int rollNo, String name, int age) {
		this.rollNo = rollNo;
		this.name = name;
		this.age = age;
	}

	public void constructorProperties() {
		System.out.println("Roll no:" + rollNo + " Name:" + name + " Age:" + age);
	}
}
