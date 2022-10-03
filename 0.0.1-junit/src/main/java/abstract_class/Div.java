package abstract_class;

public class Div extends Math_Operation {


	@Override
	void operation(float a, float d) {
		// TODO Auto-generated method stub
		result =a/d;
	}

	@Override
	void result() {
		// TODO Auto-generated method stub
		System.out.println("Result : " + result);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Div d1=new Div();
		d1.operation(6,25);
		d1.result();
		
	}

}
