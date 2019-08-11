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

public class HugeInteger
{
	private int[] intArray;
	private int numDigits;  // stores the number of digits in intArray

	public HugeInteger(String s)
	{
		intArray = new int[40];
		numDigits = 0;
		
		// call parse(s)
		parse(s);    
	}

	public HugeInteger()
	{
		intArray = new int[40];
		numDigits = 0;
	}

	public void parse(String s)
	{
		String[] x = s.split("");
		for(numDigits = 0; numDigits < (s.length() - 1); numDigits++)
		{
			intArray[numDigits] = s.charAt(numDigits);
			intArray[numDigits] = Integer.parseInt(x[numDigits]);		
		} 
	}

	public static HugeInteger add(HugeInteger hugeInt1, HugeInteger hugeInt2)
	{
		int carry = 0;
	    HugeInteger hugeInt3 = new HugeInteger();
	    for (int i = 39; i >= 0 ; i--)
	    {
	        hugeInt3.intArray[i] = (hugeInt1.intArray[i] + hugeInt2.intArray[i] + carry);
	        if (hugeInt3.intArray[i] >= 10)
	        {
	            carry = 1;
	            hugeInt3.intArray[i] -=10;
	        }  
	        else
	        	carry = 0;
	    }
	    return hugeInt3;
	}

	public static HugeInteger subtract(HugeInteger hugeInt1, HugeInteger hugeInt2)

	{
		HugeInteger hugeInt3 = new HugeInteger();
		for (int i = 39; i >= 0 ; i--)
		{
			int ten = 0;
			if ((hugeInt1.intArray[i] - hugeInt2.intArray[i]) < 0)
			{
				ten = 10;
				hugeInt3.intArray[i] = (hugeInt1.intArray[i] - hugeInt2.intArray[i] + ten);
				hugeInt1.intArray[i - 1] = (hugeInt1.intArray[i - 1] - 1);
			}
			else
				hugeInt3.intArray[i] = (hugeInt1.intArray[i] - hugeInt2.intArray[i]);
		}
    	return hugeInt3;    
	}

	public static boolean isEqualTo(HugeInteger hugeInt1, HugeInteger hugeInt2)
	{
		for (int i = 0; i <= 39; i++)
			if (hugeInt1.intArray[i] == hugeInt2.intArray[i])
				return true;
			return false;
	}

	public static boolean isNotEqualTo(HugeInteger hugeInt1, HugeInteger hugeInt2)
	{
		for (int i = 0; i <= 39; i++)
			if (hugeInt1.intArray[i] != hugeInt2.intArray[i])
				return true;
			return false;
	}

	public static boolean isGreaterThan(HugeInteger hugeInt1, HugeInteger hugeInt2)
	{
		for (int i = 39; i >= 0 ; i--)
		{
			if (hugeInt1.intArray[i] > hugeInt2.intArray[i])
				return true;
		}
		return false;
	}

	public static boolean isLessThan(HugeInteger hugeInt1, HugeInteger hugeInt2)
	{
		for (int i = 39; i >= 0 ; i--)
		{
			if (hugeInt1.intArray[i] < hugeInt2.intArray[i])
				return true;
		}
		return false;
	}

	public static boolean isGreaterThanOrEqualTo(HugeInteger hugeInt1, HugeInteger hugeInt2)
	{
		for (int i = 39; i >= 0 ; i--)
		{
			if (hugeInt1.intArray[i] >= hugeInt2.intArray[i])
				return true;
		}
		return false;
	}

	public static boolean isLessThanOrEqualTo(HugeInteger hugeInt1, HugeInteger hugeInt2)
	{
		for (int i = 39; i >= 0 ; i--)
		{
			if (hugeInt1.intArray[i] <= hugeInt2.intArray[i])
				return true;
		}
		return false;
	}
	
 	public static boolean isZero(HugeInteger hugeInt1)
	{
		for (int i = 0; i <= 39; i++)
		{
			if (hugeInt1.intArray[i] == 0)
				return true;
		}
		return false;
	}
  
	public String toString()
	{
		String x = "";
	        for(int i = 0; i <= 39; i++)
	            x += Integer.toString(intArray[i]);
		return x;
	}
}