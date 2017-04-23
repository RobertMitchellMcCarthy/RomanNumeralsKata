
public class RomanNumeralConverter {

	public String convert(Integer inputNumber){
		String RomanNumeral = "";
		switch(inputNumber){
		case 1: RomanNumeral = "I";
				break;
		case 5: RomanNumeral = "V";
				break;
		}
		return RomanNumeral;
	}
}
