package Third;

public class Sub implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		int a = 10, b = 5;
		int result = a - b;
		System.out.println(result);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sub s1 = new Sub();
		Thread t = new Thread(s1, "My third thread");

		t.start();
		String str = t.getName();
		System.out.println(str);
	}

}
