package diamond;

public interface Eat extends Sample_Interface {

	public default void eating() {
		System.out.println("Person is Eating");
	}
	
	public void demo2(int a);

}
