// Jeffrey Williams
// COP 3330 Object Oriented Programming
/* Project 5 (Pg. 358 #8.16)
 * (Huge Integer Class) Create a class HugeInteger which uses a 40-element array of digits to store 
 * integers as large as 40 digits each. Provide methods parse, toString, add and subtract. Method 
 * parse should receive a String, extract each digit using method charAt and place the integer 
 * equivalent of each digit into the integer array. For comparing HugeInteger objects, provide the 
 * following methods; isEqualTo, isNotEqualTo, isGreaterThan, isLessThan, isGreaterThanOrEqualTo and
 * isLEssThanOrEqualTo. Each of these is a predicate method that returns true if the relationship 
 * holds between the two HugeInteger objects and returns false if the relationship does not hold.
 * Provide a predicate method isZero. If you feel ambitious, also provide methods multiply, divide and
 * remainder. [Note: Primitive boolean values can be output as the word "true" or the word "false" with 
 * format specifier %b.]*/

public class HugeIntegerTest
{

	public static void main(String[] args)
	{
		String eight = "";
		String one = "";
		String seven = "";
		HugeInteger alleight;
		HugeInteger allone;
		HugeInteger allseven;
		HugeInteger zeroes = new HugeInteger();
		
		for(int i = 0; i <= 40; i++)
		{
			eight += "8";
			one += "1";
			seven += "7";
		}
		
		alleight = new HugeInteger(eight); // create a HugeInteger of all 8's
		allone = new HugeInteger(one); // create a HugeInteger of all 0's
		allseven = new HugeInteger(seven);
		
		// demonstrate the toString method
		System.out.printf("%-38s %-38s \n","alleight: ", alleight.toString());
		System.out.printf("%-38s %-38s \n","allseven: ",  allseven.toString());
		System.out.printf("%-38s %-38s \n","allone: ",  allone.toString());
		System.out.printf("%-38s %-38s \n\n","zereos: ",  zeroes.toString());
	
		//demonstrate addition	
		System.out.printf("%-38s %-38s \n","allone adding alleight: ", 
				HugeInteger.add(allone, alleight));
		System.out.printf("%-38s %-38s \n\n","allone adding allseven: ", 
				HugeInteger.add(allone, allseven));
		
		// demonstrate subtraction
		System.out.printf("%-38s %-38s \n","alleight subtracting allseven: ", 
				HugeInteger.subtract(alleight, allseven));
		System.out.printf("%-38s %-38s \n\n","alleight subtracting allone: ", 
				HugeInteger.subtract(alleight, allone));

		//demonstrate isEqualTo
		System.out.printf("%-38s %-38s \n","Is allone equal to allseven: ", 
				HugeInteger.isEqualTo(allone, allseven));
		System.out.printf("%-38s %-38s \n\n","Is allseven equal to allseven: ", 
				HugeInteger.isEqualTo(allseven, allseven));

		//demonstrate isNotEqualTo
		System.out.printf("%-38s %-38s \n","Is allone NOT equal to allseven: ", 
				HugeInteger.isNotEqualTo(allone, allseven));
		System.out.printf("%-38s %-38s \n\n","Is allseven NOT equal to allseven: ", 
				HugeInteger.isNotEqualTo(allseven, allseven));

		//demonstrate isGreaterThan
		System.out.printf("%-38s %-38s \n","Is allone greater than allseven: ", 
				HugeInteger.isGreaterThan(allone, allseven));
		System.out.printf("%-38s %-38s \n\n","Is allseven greater than allone: ", 
				HugeInteger.isGreaterThan(allseven, allone));

		//demonstrate isLessThan
		System.out.printf("%-38s %-38s \n","Is allone less than allseven: ", 
				HugeInteger.isLessThan(allone, allseven));
		System.out.printf("%-38s %-38s \n\n","Is allseven less than allone: ", 
				HugeInteger.isLessThan(allseven, allone));
		
		//demonstrate isGreaterThanOrEqualTo
		System.out.printf("%-38s %-38s \n","Is allone > than or = to allseven: ", 
				HugeInteger.isGreaterThanOrEqualTo(allone, allseven));
		System.out.printf("%-38s %-38s \n","Is allseven > than or = to allone: ", 
				HugeInteger.isGreaterThanOrEqualTo(allseven, allone));
		System.out.printf("%-38s %-38s \n\n","Is allseven > than or = to allseven: ", 
				HugeInteger.isGreaterThanOrEqualTo(allseven, allseven));
		
		//demonstrate isLessThanOrEqualTo
		System.out.printf("%-38s %-38s \n","Is allone < than or = to allseven: ", 
				HugeInteger.isLessThanOrEqualTo(allone, allseven));
		System.out.printf("%-38s %-38s \n","Is allseven < than or = to allone: ", 
				HugeInteger.isLessThanOrEqualTo(allseven, allone));
		System.out.printf("%-38s %-38s \n\n","Is allseven < than or = to allseven: ", 
				HugeInteger.isLessThanOrEqualTo(allseven, allseven));
	
		//demonstrate isZero
		System.out.printf("%-38s %-38s \n","Is allone zero: ", 
				HugeInteger.isZero(allone));
		System.out.printf("%-38s %-38s \n","Is allseven zero: ", 
				HugeInteger.isZero(allseven));
		System.out.printf("%-38s %-38s \n\n","Is allzeroes zero: ", 
				HugeInteger.isZero(zeroes));
	}
}