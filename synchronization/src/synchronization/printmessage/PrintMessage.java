package synchronization.printmessage;

public class PrintMessage implements Runnable{
	public void printMessage() {
		System.out.print("[");
		try {
			Thread.sleep(1000);
			System.out.print("Hello");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("]");
	}

	@Override
	public void run() {
		synchronized(this) {
			printMessage();
		}
		
	}
}
