/**
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 * @author Mads
 *
 */
public class Problem005
{
	public static void main(String[] args)
	{
		boolean found = false;
		int x = 20;
		int i = 1;

		do
		{
			if (x % i == 0)
			{
				i++;
			}
				
			else
			{
				x++;
				i = 1;
			}
				
			
			if (i == 20)
				found = true;
		}
		while (found == false);
		
		System.out.println(x);

	}
}
