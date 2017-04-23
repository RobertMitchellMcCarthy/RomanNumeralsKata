
public class RomanNumeralConverter {

	public String convert(Integer inputNumber){
		String RomanNumeral = "";
		switch(inputNumber){
		case 1: RomanNumeral = "I";
				break;
		case 5: RomanNumeral = "V";
				break;
		case 10: RomanNumeral = "X";
				break;
		case 50: RomanNumeral = "L";
				break;
		case 100: RomanNumeral = "C";
				break;
		case 500: RomanNumeral = "D";
				break;
		}
		return RomanNumeral;
	}
}
