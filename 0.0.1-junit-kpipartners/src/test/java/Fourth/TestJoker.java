package Fourth;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestJoker {

	@Test
	public void check() {
		
		Joker j = new Joker();
		assertEquals("Rambo Circus", j.Circus_name);

		Joker j1 = new Joker("Bharatanatyam");
		assertEquals("Bharatanatyam", j1.J_dance);
		
		Joker j2 = new Joker("Kathak");
		assertEquals("Kathak", j2.J_dance);


	}

}
