package Third;

public class Add implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
	static public void add() {
		int a = 10, b = 5;
		int result = a + b;
		System.out.println(result);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Add a1 = new Add();
		Thread t = new Thread(a1, "My second thread");

		t.start();
		String str = t.getName();
		System.out.println(str);
	}

}
