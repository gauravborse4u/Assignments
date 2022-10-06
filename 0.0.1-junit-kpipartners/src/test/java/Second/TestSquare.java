package Second;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestSquare {

	@Test
	public void check() {

		Square t1 = new Square("Square", 4);
		
		assertEquals("Square", t1.shape_name());
		assertEquals(4, t1.edges());
	}
	
}
