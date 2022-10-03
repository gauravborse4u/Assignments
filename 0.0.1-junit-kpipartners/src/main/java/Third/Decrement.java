package Third;

public class Decrement implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		int a = 10;
		int result = --a;
		System.out.println(result);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Decrement d1 = new Decrement();
		Thread t = new Thread(d1, "My seventh thread");

		t.start();
		String str = t.getName();
		System.out.println(str);
	}
	
}
