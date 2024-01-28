package encapsulation.entity;

public class Student {
	private int rollNo;
	private String name;
	private byte age;
	
	//for better control of the instance variable we use:-
	//setter/mutator must be public
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(byte age) {
		this.age = age;
	}
	
	//getter/accessor must be public 
	public int getRollNo() {
		return rollNo;
	}
	public String getName() {
		return name;
	}
	public byte getAge() {
		return age;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", age=" + age + "]";
	}
	

}
