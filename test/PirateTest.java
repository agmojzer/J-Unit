import static org.junit.Assert.*;

import org.junit.Test;

public class PirateTest {

	@Test
	public void testCreatePirate() {
		Pirate p = new Pirate("Captain Hook");
		assertEquals("Captain Hook", p.getName());
		
	}
	
	@Test
	public void testCreateOctoPirate() {
		Pirate p = new Pirate ("Octopus Pete", 8);
		assertEquals("Octopus Pete", p.getName());
		assertEquals(8, p.getLimbsRemaining());
	}
	
	@Test(expected=NullPointerException.class)
	public void testNullPirate() {
		Pirate p = null;
		p.loseALimb();
	}
	
}
