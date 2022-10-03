package Second;

public abstract class Shapes implements Details {

	String shape_name;
	int edges;
	
	Shapes(String shape_name, int edges) {
		this.shape_name = shape_name;
		this.edges = edges;
	}

	abstract String shape_name();

	abstract int edges();

}
