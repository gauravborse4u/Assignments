package Third;

public class Equal_Not implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		int a = 10, b = 5;
		boolean result = a != b;
		System.out.println(result);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Equal_Not g1 = new Equal_Not();
		Thread t = new Thread(g1, "My nineth thread");

		t.start();
		String str = t.getName();
		System.out.println(str);
	}
	
}
