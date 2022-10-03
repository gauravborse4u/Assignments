package Second;

public class Hexagon extends Shapes {

	Hexagon(String shape_name, int edges) {
		super(shape_name, edges);
		// TODO Auto-generated constructor stub
	}

	@Override
	String shape_name() {
		// TODO Auto-generated method stub
		return shape_name;
	}

	@Override
	int edges() {
		// TODO Auto-generated method stub
		return edges;
	}

	@Override
	public void Show_Details() {
		// TODO Auto-generated method stub
		System.out.println("Shape Name : " + shape_name + "\nEdges : " + edges);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hexagon h1 = new Hexagon("Hexagon", 6);
		h1.Show_Details();

	}

}
