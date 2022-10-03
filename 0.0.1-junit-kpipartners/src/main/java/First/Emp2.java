package First;

public class Emp2 extends Employee_Abstract {

	Emp2(int emp_id, String name, String birthdate, int age, String address, String department, String designation,
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

	@Override
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

	public static void main(String args[]) {

		Emp2 e2 = new Emp2(102, "Ram", "15-Jun-2001", 20, "UP", "Consulting", "Project Trainee",
				"ram.patil@kpipartners.com");

		e2.Show_detail();
	}

}
