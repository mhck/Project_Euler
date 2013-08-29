import java.math.BigInteger;

public class Problem020
{
	private static BigInteger bigInt = BigInteger.valueOf(1);
	
	public static void main(String[] args)
	{
		run(100);
	}

	public static void run(int number)
	{
		for (int i = number; i > 0; i--)
		{
			bigInt = bigInt.multiply(BigInteger.valueOf(i));
		}
		
		
		String str = bigInt.toString();
		System.out.println("The sum of the digits in the number " + number + "! is " + calcDigits(str));
	}
	
	public static int calcDigits(String str)
	{
		int res = 0;
		int size = str.length();
		for (int i = 0; i < size; i++)
		{
			Character c = str.charAt(i);
			String curr = c.toString();
			res += Integer.parseInt(curr);
		}
		return res;
	}
}
