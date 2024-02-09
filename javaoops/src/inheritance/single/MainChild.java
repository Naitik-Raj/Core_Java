package inheritance.single;

import inheritance.single.classes.Child;

public class MainChild {
	public MainChild() {
//		Child child=new Child();
//		child.setFirstName("Naitik");
//		child.setLastName("Raj");
//		System.out.println(child.getFirstName()+ " " +child.getLastName());
		
		
		//Constructors are not inherited to child class
//		Child child1=new Parent();
		
		
		Child child2 = new Child("Raj","Singhaniya");
		System.out.println(child2.getFirstName()+ " " +child2.getLastName());
		
		}
		public static void main(String[] args) {
			MainChild obj=new MainChild();
		}
}
