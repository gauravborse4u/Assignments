package First;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestEmp {

	@Test
	public void data_check() {
		Emp1 e1 = new Emp1(101, "Gaurav", "24-Oct-2001", 20, "Maharashtra", "Consulting", "Project Trainee",
				"gaurav.borse@kpipartners.com");

		assertEquals(101, e1.emp_id);

		assertEquals("Gaurav", e1.name);

		assertEquals("24-Oct-2001", e1.birthdate);

		assertEquals(20, e1.age);

		assertEquals("Maharashtra", e1.address);

		assertEquals("Consulting", e1.department);

		assertEquals("Project Trainee", e1.designation);

		assertEquals("gaurav.borse@kpipartners.com", e1.email);

	}

	@Test
	public void data_check2() {
		Emp2 e2 = new Emp2(102, "Ram", "15-Jun-2001", 20, "UP", "Consulting", "Project Trainee",
				"ram.patil@kpipartners.com");

		assertEquals(102, e2.emp_id);

		assertEquals("Ram", e2.name);

		assertEquals("15-Jun-2001", e2.birthdate);

		assertEquals(20, e2.age);

		assertEquals("UP", e2.address);

		assertEquals("Consulting", e2.department);

		assertEquals("Project Trainee", e2.designation);

		assertEquals("ram.patil@kpipartners.com", e2.email);

	}

}
