import java.util.ArrayList;

public class Problem010 {

	private static ArrayList<Long> listOfPrimes = new ArrayList<Long>();

	public static void main(String args[])
	{

		long count = 0;
		for (long i = 2; i < 2000000; i++) {
			if (isPrime(i)) {
				count += i;
			}
		}

		System.out.println("\nTotal " + count);

	}

	private static boolean isPrime(long n) 
	{

		String strFromN = new Long(n).toString();
		if ((strFromN.length() != 1) && (strFromN.endsWith("2") || strFromN.endsWith("4") || strFromN.endsWith("5") || strFromN.endsWith("6") || strFromN.endsWith("8"))) {
			return false;
		}

		for (Long num : listOfPrimes) {
			if (num > Math.sqrt(n)) {
				break;
			}
			if (n % num.longValue() == 0) {
				return false;
			}
		}


		listOfPrimes.add(new Long(n));
		return true;
	}
}
