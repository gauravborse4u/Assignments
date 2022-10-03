package Third;

public class Mul implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		int a = 10, b = 5;
		int result = a * b;
		System.out.println(result);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mul m1 = new Mul();
		Thread t = new Thread(m1, "My fourth thread");

		t.start();
		String str = t.getName();
		System.out.println(str);
	}

}
