import java.util.ArrayList;
import java.util.Arrays;
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
		case 40: RomanNumeral = "XL";
				break;
		case 50: RomanNumeral = "L";
				break;
		case 90: RomanNumeral = "XC";
				break;
		case 100: RomanNumeral = "C";
				break;
		case 400: RomanNumeral = "CD";
				break;
		case 500: RomanNumeral = "D";
				break;
		case 900: RomanNumeral = "CM";
				break;
		case 1000: RomanNumeral = "M";
				break;
		}
	
		return RomanNumeral;
	}
	
	public int findHighestValue(Integer inputNumber){
		ArrayList <Integer> convertingValues = new ArrayList<>(Arrays.asList(1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1));
		for(Integer i : convertingValues){
			if(inputNumber > i)
				return i;
		}
		return 1;
	}
}
