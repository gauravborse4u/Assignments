package Sixth;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class TestSet_Operation {

	@Test
	public void check_set() {
		
		Set_Operation s = new Set_Operation();
		
		assertEquals(110, s.set_size());
		
	}
	
}
