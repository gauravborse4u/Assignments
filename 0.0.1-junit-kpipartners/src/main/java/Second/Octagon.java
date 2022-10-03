package Second;

public class Octagon extends Shapes {

	Octagon(String shape_name, int edges) {
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

		Octagon o1 = new Octagon("Octagon", 8);
		o1.Show_Details();
	}

}
