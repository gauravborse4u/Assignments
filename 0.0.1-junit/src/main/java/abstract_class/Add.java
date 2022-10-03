package abstract_class;

public class Add extends Math_Operation {

	
	@Override
	void operation(float a, float b) {
		// TODO Auto-generated method stub
		result =a+b;
	}

	@Override
	void result() {
		// TODO Auto-generated method stub
		System.out.println("Result : " + result);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Add a1=new Add();
		a1.operation(5,6);
		a1.result();
		
	}

}
