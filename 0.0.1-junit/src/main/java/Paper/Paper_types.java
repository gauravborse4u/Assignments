package Paper;

public class Paper_types {
	
	void Tissue() {
		System.out.println("This is Tissue paper");
	}

	void Card_Board() {
		System.out.println("This is Card board paper");
	}
	
	void Origami() {
		System.out.println("This is Origami paper");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Paper_types pt=new Paper_types();
		
		pt.Tissue();
		pt.Card_Board();
		pt.Origami();
		
	}

}
