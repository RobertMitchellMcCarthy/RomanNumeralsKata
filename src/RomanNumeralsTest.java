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
	
	@Test
	public void whenFiveHundredIsPassedReturnD(){
		RomanNumeralConverter converter = new RomanNumeralConverter();
		assertEquals("D", converter.convert(500));
	}
	
	@Test
	public void whenOneThousandIsPassedReturnM(){
		RomanNumeralConverter converter = new RomanNumeralConverter();
		assertEquals("M", converter.convert(1000));
	}
	
	@Test
	public void whenFourIsPassedReturnIV(){
		RomanNumeralConverter converter = new RomanNumeralConverter();
		assertEquals("IV", converter.convert(4));
	}
	
	@Test
	public void whenNineIsPassedReturnIX(){
		RomanNumeralConverter converter = new RomanNumeralConverter();
		assertEquals("IX", converter.convert(9));
	}
	
	@Test
	public void whenFortyIsPassedReturnXL(){
		RomanNumeralConverter converter = new RomanNumeralConverter();
		assertEquals("XL", converter.convert(40));
	}
	
	@Test
	public void whenNinetyIsPassedReturnXC(){
		RomanNumeralConverter converter = new RomanNumeralConverter();
		assertEquals("XC", converter.convert(90));
	}
	
	@Test
	public void whenFourHundredIsPassedReturnCD(){
		RomanNumeralConverter converter = new RomanNumeralConverter();
		assertEquals("CD", converter.convert(400));
	}
	
	@Test
	public void when900IsPassedReturnCM(){
		RomanNumeralConverter converter = new RomanNumeralConverter();
		assertEquals("CM", converter.convert(900));
	}
	
	@Test
	public void findHighestConvertingValue(){
		RomanNumeralConverter converter = new RomanNumeralConverter();
		assertEquals(100, converter.findHighestValue(300));
	}
}
