package Second;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestShapes {

	@Test
	public void check() {

		Triangle t1 = new Triangle("Triangle", 3);
		
		assertEquals("Triangle", t1.shape_name());
		assertEquals(3, t1.edges());
	}

	@Test
	public void check2() {

		Square t1 = new Square("Square", 4);
		
		assertEquals("Square", t1.shape_name());
		assertEquals(4, t1.edges());
	}
	
	@Test
	public void check3() {

		Pentagon t1 = new Pentagon("Pentagon", 5);
		
		assertEquals("Pentagon", t1.shape_name());
		assertEquals(5, t1.edges());
	}
	
	@Test
	public void check4() {

		Hexagon t1 = new Hexagon("Hexagon", 6);
		
		assertEquals("Hexagon", t1.shape_name());
		assertEquals(6, t1.edges());
	}
	
	@Test
	public void check5() {

		Heptagon t1 = new Heptagon("Heptagon", 7);
		
		assertEquals("Heptagon", t1.shape_name());
		assertEquals(7, t1.edges());
	}
	
	@Test
	public void check6() {

		Octagon t1 = new Octagon("Octagon", 8);
		
		assertEquals("Octagon", t1.shape_name());
		assertEquals(8, t1.edges());
	}
	
	@Test
	public void check7() {

		Nonagon t1 = new Nonagon("Nonagon", 9);
		
		assertEquals("Nonagon", t1.shape_name());
		assertEquals(9, t1.edges());
	}
	
	@Test
	public void check8() {

		Decagon t1 = new Decagon("Decagon", 10);
		
		assertEquals("Decagon", t1.shape_name());
		assertEquals(10, t1.edges());
	}
	
}
