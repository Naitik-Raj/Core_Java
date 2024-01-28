package inheritance.single;

import inheritance.single.classes.Child;

public class MainChild {
	public MainChild() {
		Child child = new Child();
		child.setFirstName("Naitik");
		child.setLastName("Raj");
		// constructor can't be inherit in child class to parent
		//	Child ch = new parent();

		System.out.print(child.getFirstName() + child.getLastName());
	}
}
