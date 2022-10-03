package diamond;

public interface Drink extends Sample_Interface{

	public default void drinking() {
		System.out.println("Penr on is Drinking");
	}

	public void demo2(int a);
}
