package abstract_class;

public class Mul extends Math_Operation {


	@Override
	void operation(float a, float b) {
		// TODO Auto-generated method stub
		result=a*b;
	}

	@Override
	void result() {
		// TODO Auto-generated method stub
		System.out.println("Result : " + result);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Mul m1=new Mul();
		m1.operation(5,6);
		m1.result();
		
	}

}
