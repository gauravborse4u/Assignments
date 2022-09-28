package First;

public class Nonveg extends Food {

	@Override
	void name() {
		// TODO Auto-generated method stub
		System.out.println("Chiken");
	}

	@Override
	void type() {
		// TODO Auto-generated method stub
		System.out.println("This is Non-Veg");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Nonveg non1=new Nonveg();
		
		non1.name();
		non1.type();
	}
}
