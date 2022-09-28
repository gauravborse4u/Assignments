package Second;

public class Age extends Person {

		 
	    private int age; 
	 
	    
	    @Override
		int getAge() {
			// TODO Auto-generated method stub
			return age;
		}
	    
	    @Override
		void setAge(int age) {
			// TODO Auto-generated method stub
	    	this.age=age;
		}
	 

	    public static void main(String[] args)
	    {
	 
	        Age a1 = new Age();
	 
	        a1.setAge(20);
	 
	        System.out.println("The age of the person is: " + a1.getAge());
	    }
		
	
}
