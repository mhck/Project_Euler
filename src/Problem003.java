
/**
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600851475143 ?
 * @author Mads
 *
 */
public class Problem003 {
	public static void main(String[] args)
	{
		long n = 600851475143L;
		int factor = 3; // only odd numbers
		while(n > 1)
		{
			if(n % factor == 0)
				n = n/factor;
			else
				factor = factor + 2;
			System.out.println(factor);
		}
		
	}
}