package Third;

public class Mod implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		int a = 2, b = 200;
		int result = a % b;
		System.out.println(result);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mod mo1 = new Mod();
		Thread t = new Thread(mo1, "My Fifth thread");

		t.start();
		String str = t.getName();
		System.out.println(str);
	}

}
