package Third;

public class Increment implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		int a = 10;
		int result = ++a;
		System.out.println(result);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Increment i1 = new Increment();
		Thread t = new Thread(i1, "My sixth thread");

		t.start();
		String str = t.getName();
		System.out.println(str);
	}
	
}
