import java.math.BigInteger;

/**
 * PROJECT EULER: PROBLEM 48
 * 
 * Find the last ten digits of the series 1000^1000
 * The series, 1^1 + 2^2 + 3^3 + ... + 10^10 = 10405071317.
 * 
 * Find the last ten digits of the series, 1^1 + 2^2 + 3^3 + ... + 1000^1000.
 * 
 * @author Mads Heckmann
 *
 */
public class Problem048 
{
	public static void main(String[] args) // NOT DONE
	{
		BigInteger bigInt = BigInteger.valueOf(1);
		
		for (int i = 1; i <= 10; i++)
		{
			bigInt = bigInt.add(bigInt.pow(i));
		}
		
		System.out.println(bigInt.toString());
	}
}
