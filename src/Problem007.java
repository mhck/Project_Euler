
public class Problem007
{
	public static void main(String[] args)
	{
		int primeNumberToFind = 10001;
		int numPrimes = 1;
		int number = 1;
		 
		while (numPrimes < primeNumberToFind)
		{
			number = number + 2;
		    if (isPrime(number))
		    {
		        numPrimes++;
		    }
		}
		
		System.out.println("Prime number " + primeNumberToFind + " is: " + number);
	}
	
	public static boolean isPrime(int num)
	{
		if (num <= 1)
			return false;
		 
		if (num == 2)
			return true;
		
		if (num % 2 == 0)
			return false;
		
		int i = 3;
		while ((i * i) <= num)
		{
	        if (num % i == 0)
	            return false;
	        else
	            i += 2;
	    }
	 return true;
	}
}
