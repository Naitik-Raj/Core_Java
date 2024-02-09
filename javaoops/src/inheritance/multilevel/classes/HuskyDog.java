package inheritance.multilevel.classes;

//HuskyDog class inheriting from Dog
public class HuskyDog extends Dog {
	public void displayInfo() {
		System.out.println("This is Husky dog");
	}

	// Overriding the eat method in the Animal class
	@Override
	public void eat() {
//		super.eat(); //super will call immediate  parent class
		System.out.println("Husky dog eats best quality pedigree food.");// this will call root parent class
	}

}
