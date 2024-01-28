package inheritance.single.classes;

public class Child  extends Parent{
	private String firstName;
	private String lastName;

	@Override
	public String toString() {
		return "Child [firstName=" + firstName + "]";
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	
	
	
}
