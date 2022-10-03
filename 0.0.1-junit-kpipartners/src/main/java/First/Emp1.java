package First;

public class Emp1 extends Employee_Abstract {

	Emp1(int emp_id, String name, String birthdate, int age, String address, String department, String designation,
			String email) {
		super(emp_id, name, birthdate, age, address, department, designation, email);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int emp_id() {
		// TODO Auto-generated method stub
		return emp_id;
	}

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public String birthdate() {
		// TODO Auto-generated method stub
		return birthdate;
	}

	@Override
	public int age() {
		// TODO Auto-generated method stub
		return age;
	}

	public String address() {
		// TODO Auto-generated method stub
		return address;
	}

	@Override
	public String department() {
		// TODO Auto-generated method stub
		return department;
	}

	@Override
	public String designation() {
		// TODO Auto-generated method stub
		return designation;
	}

	@Override
	public String email() {
		// TODO Auto-generated method stub
		return email;
	}

	@Override
	public void Show_detail() {
		// TODO Auto-generated method stub
		System.out.println("Employee ID :" + emp_id + "\nName :" + name + "\nBirthdate :" + birthdate + "\nAge :" + age
				+ "\nAddress :" + address + "\nDepartment :" + department + "\nDesignation :" + designation
				+ "\nEmail :" + email);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Emp1 e1 = new Emp1(101, "Gaurav", "24-Oct-2001", 20, "Maharashtra", "Consulting", "Project Trainee",
				"gaurav.borse@kpipartners.com");

		e1.Show_detail();
	}

}
