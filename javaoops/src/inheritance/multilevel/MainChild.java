package inheritance.multilevel;

import inheritance.multilevel.classes.HuskyDog;

public class MainChild {

	public static void main(String[] args) {
		// Creating an instance of the HuskyDog class
        HuskyDog husky = new HuskyDog();

        // Calling methods from different levels of inheritance
        husky.displayInfo();
        husky.eat();  // Overridden method in HuskyDog class is called
        husky.bark();
        husky.sleep();
	}

}
