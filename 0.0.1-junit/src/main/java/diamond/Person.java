package diamond;

//if we try to extends the two classes at a time it creates ambiguity
public class Person implements Eat, Drink {

	public void display()   
	{  
	Eat.super.eating();  
	Drink.super.drinking();  
	}  
	
	@Override
	public void demo2(int a) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void demo() {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person c1=new Person();
		
		c1.display();
		
	}

	

}
