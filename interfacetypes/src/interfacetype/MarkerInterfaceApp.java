package interfacetype;

import interfacetypes.marker.*;

public class MarkerInterfaceApp {

	public static void main(String[] args) {
		Student std1 = new Student();
		RegistrableImpl registration = RegistrableImpl.getInstance(std1);
		registration.registerStudent();
	}

}
