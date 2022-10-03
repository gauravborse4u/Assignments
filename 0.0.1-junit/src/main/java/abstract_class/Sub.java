package abstract_class;

public class Sub extends Math_Operation {


	@Override
	void operation(float a, float b) {
		// TODO Auto-generated method stub
		result =a-b;
	}

	@Override
	void result() {
		// TODO Auto-generated method stub
		System.out.println("Result : " + result);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sub s1=new Sub();
		s1.operation(5,6);
		s1.result();
		
	}

}
