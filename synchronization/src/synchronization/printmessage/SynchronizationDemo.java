package synchronization.printmessage;

public class SynchronizationDemo {

	public static void main(String[] args) {
		PrintMessage print = new PrintMessage();
		//Threads is using same resource.
		Thread thread1 = new Thread(print,"Thread1");
		Thread thread2 = new Thread(print,"Thread1");
		Thread thread3 = new Thread(print,"Thread1");
		
		thread1.start();
		thread2.start();
		thread3.start();

	}

}
