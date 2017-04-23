import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RomanNumeralsTest {
	@Test
	public void whenOneIsPassedReturnI(){
		RomanNumeralConverter converter = new RomanNumeralConverter();
		assertEquals("I", converter.convertOne(1));
	}
}
