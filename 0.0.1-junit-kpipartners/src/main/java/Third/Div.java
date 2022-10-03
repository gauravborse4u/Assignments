package Third;

public class Div implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		int a = 10, b = 5;
		int result = a / b;
		System.out.println(result);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Div d1 = new Div();
		Thread t = new Thread(d1, "My Fifth thread");

		t.start();
		String str = t.getName();
		System.out.println(str);
	}

}
