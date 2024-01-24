package loopstatement;

public class LoopStatement {

	public static void main(String[] args) {
		forLoop();
		whileLoop();
		doWhileLoop();
		forEachLoop();
	}

	static void forEachLoop() {
		char[] arr = {'1','2','3','4'};
		for(char ch:arr) {
			System.out.print(ch);
		}
	}

	static void doWhileLoop() {
		int i = 1, res = 1;
		do {
			res = i * res;
			i++;
		}while(i<=5);
		System.out.println(res);
	}

	static void whileLoop() {
		int i = 1, res = 1;
		while(i<=5) {
			res = i * res;
			i++;
		}
		System.out.println(res);
		
	}

	static void forLoop() {
		int fact = 5, res = 1;
		for(int i=1;i<=fact;i++) {
			res = i * res;
		}
		System.out.println(res);
	}
	

}
