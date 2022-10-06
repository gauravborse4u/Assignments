package Third;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestThread {

	@Test
	public void check1() {

		Thread t = new Thread("My first thread");

		assertEquals("My first thread", t.getName());

	}

	@Test
	public void check2() {

		Sub a2 = new Sub();
		Thread t = new Thread(a2, "My second thread");

		assertEquals("My second thread", t.getName());

	}

	@Test
	public void check3() {

		Div a3 = new Div();
		Thread t = new Thread(a3, "My third thread");

		assertEquals("My third thread", t.getName());

	}

	@Test
	public void check4() {

		Mul a4 = new Mul();
		Thread t = new Thread(a4, "My fourth thread");

		assertEquals("My fourth thread", t.getName());

	}

	@Test
	public void check5() {

		Increment a5 = new Increment();
		Thread t = new Thread(a5, "My fifth thread");

		assertEquals("My fifth thread", t.getName());

	}

	@Test
	public void check6() {

		Decrement a6 = new Decrement();
		Thread t = new Thread(a6, "My sixth thread");

		assertEquals("My sixth thread", t.getName());

	}

	@Test
	public void check7() {

		Mod a7 = new Mod();
		Thread t = new Thread(a7, "My seventh thread");

		assertEquals("My seventh thread", t.getName());

	}

	@Test
	public void check8() {

		Greater_equal a8 = new Greater_equal();
		Thread t = new Thread(a8, "My eighth thread");

		assertEquals("My eighth thread", t.getName());

	}

	@Test
	public void check9() {

		Equal_Not a9 = new Equal_Not();
		Thread t = new Thread(a9, "My nineth thread");

		assertEquals("My nineth thread", t.getName());

	}

}
