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
	
	@Test
	public void whenFiftyIsPassedReturnL(){
		RomanNumeralConverter converter = new RomanNumeralConverter();
		assertEquals("L", converter.convert(50));
	}
	
	@Test
	public void whenOneHundredIsPassedReturnC(){
		RomanNumeralConverter converter = new RomanNumeralConverter();
		assertEquals("C", converter.convert(100));
	}
}
