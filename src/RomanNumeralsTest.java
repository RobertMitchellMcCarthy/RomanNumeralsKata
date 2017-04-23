import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RomanNumeralsTest {
	@Test
	public void whenOneIsPassedReturnI(){
		RomanNumeralConverter converter = new RomanNumeralConverter();
		assertEquals("I", converter.convert(1));
	}
	
	@Test
	public void whenFiveIsPassedReturnV(){
		RomanNumeralConverter converter = new RomanNumeralConverter();
		assertEquals("V", converter.convert(5));
	}
	
	@Test
	public void whenTenIsPassedReturnX(){
		RomanNumeralConverter converter = new RomanNumeralConverter();
		assertEquals("X", converter.convert(10));
	}
}
