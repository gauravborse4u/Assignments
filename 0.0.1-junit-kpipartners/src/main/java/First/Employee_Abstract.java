package First;

public abstract class Employee_Abstract implements Employee_Interface {

	int emp_id, age;
	String name, birthdate, address, department, designation, email;

	Employee_Abstract(int emp_id, String name, String birthdate, int age, String address, String department,
			String designation, String email) {
		this.emp_id = emp_id;
		this.name = name;
		this.birthdate = birthdate;
		this.age = age;
		this.address = address;
		this.department = department;
		this.designation = designation;
		this.email = email;
	}

}
