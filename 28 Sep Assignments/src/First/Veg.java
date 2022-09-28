package First;

public class Veg extends Food{


	@Override
	void name() {
		// TODO Auto-generated method stub
		System.out.println("Fruits");
	}

	@Override
	void type() {
		// TODO Auto-generated method stub
		System.out.println("This is Veg");
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Veg v1=new Veg();
		
		v1.name();
		v1.type();
		
	}
}
