package inheritance.single.classes;

public class Child extends Parent {
	String firstName;
	public Child() {
		super();
	}
	//variable shadowing
	public Child(String firstName, String lastName) {
		super(lastName); //parameterized constructor of super class
		this.firstName=firstName;
//		super(lastName); //always use super in first line
	}
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Override
	public String toString() {
		return "Child [firstName=" + firstName + "]";
	}
	
}