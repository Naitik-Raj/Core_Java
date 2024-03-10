package polling.supplier;

import polling.resource.PrintString;

public class Supplier implements Runnable{
	PrintString printString;
	
	public Supplier(PrintString printString) {
		super();
		this.printString = printString;
	}

	public void setMessage() {
		String msg = "Naitik, Raj, Deepak, Kumar, 0";
		String[] strArr = msg.split(", ");
		
		for(String name: strArr) {
			printString.setString(name);
		}
	}

	@Override
	public void run() {
		setMessage();
	}
}
