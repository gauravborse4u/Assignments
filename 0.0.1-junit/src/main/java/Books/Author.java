package Books;

public class Author {
	
	String a_name="Robert Kiyosaki";
	String b_name="Rich Dad Poor Dad";
	
	void Book_name() {
		System.out.println("Book Name : " + b_name);
	}
	
	void A_Name() {
		System.out.println("This Book is publish by : " + a_name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Author a1=new Author();
		
		a1.Book_name();
		a1.A_Name();
		
	}

}
