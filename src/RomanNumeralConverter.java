
public class RomanNumeralConverter {

	public String convert(Integer inputNumber){
		String RomanNumeral = "";
		switch(inputNumber){
		case 1: RomanNumeral = "I";
				break;
		case 4: RomanNumeral = "IV";
				break;
		case 5: RomanNumeral = "V";
				break;
		case 9: RomanNumeral = "IX";
				break;
		case 10: RomanNumeral = "X";
				break;
		case 50: RomanNumeral = "L";
				break;
		case 100: RomanNumeral = "C";
				break;
		case 500: RomanNumeral = "D";
				break;
		case 1000: RomanNumeral = "M";
				break;
		}
		return RomanNumeral;
	}
}
