package Fourth;

public class Joker {

	String Circus_name;
	String J_dance;

	Joker() {
		Circus_name = "Rambo Circus";
	}

	Joker(String J_dance) {
		this.J_dance = J_dance;
	}

	void c_name() {
		System.out.println("Circus Name : " + Circus_name);
	}

	void d_show() {
		System.out.println("Joker is Dancing : " + J_dance);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Joker j2 = new Joker();
		Joker j1 = new Joker();
		Joker j3 = new Joker();
		Joker j4 = new Joker();
		Joker j5 = new Joker();
		Joker j6 = new Joker();
		Joker j7 = new Joker();
		Joker j8 = new Joker();

		Joker j11 = new Joker("Bharatanatyam");
		Joker j22 = new Joker("Manipuri Dance");
		Joker j33 = new Joker("Kathak");
		Joker j44 = new Joker("Odissi Dance");
		Joker j55 = new Joker("Kuchipudi");
		Joker j66 = new Joker("Kathakali");
		Joker j77 = new Joker("Bhangra");
		Joker j88 = new Joker("Ghumar");

		j2.c_name();
		j1.c_name();
		j3.c_name();
		j4.c_name();
		j5.c_name();
		j6.c_name();
		j7.c_name();
		j8.c_name();

		j11.d_show();
		j22.d_show();
		j33.d_show();
		j44.d_show();
		j55.d_show();
		j66.d_show();
		j77.d_show();
		j88.d_show();

	}
}