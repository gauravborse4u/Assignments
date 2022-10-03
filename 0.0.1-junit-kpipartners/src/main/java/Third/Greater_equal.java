package Third;

public class Greater_equal implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		int a = 10, b = 5;
		boolean result = a >= b;
		System.out.println(result);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Greater_equal b1 = new Greater_equal();
		Thread t = new Thread(b1, "My eighth thread");

		t.start();
		String str = t.getName();
		System.out.println(str);
	}

}
