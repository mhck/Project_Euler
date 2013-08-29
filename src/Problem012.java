
public class Problem012
{
	private int size, factor = 0;
	private long[] array;

	public static void main(String[] args)
	{
		new Problem012().run();
	}

	public void run()
	{	
		findTriangles(10000000);
		findDivisor(500);
//		System.out.println(listFactors(900000000000000000L));
	}
	
	public void findTriangles(int triangles)
	{
		System.out.println("Finding triangles...");
		size = triangles;
		array = new long[triangles];
		array[0] = 1;
		long lastTriangle = 1;
		for (int i = 1; i < triangles; i++)
		{
			{
				array[i] = lastTriangle + (i + 1);
				lastTriangle = array[i];
			}	
		}
		System.out.println("Found triangles...");
		
	}
	
	public int listFactors(long num) // returns how many factors triangle with value num has
	{
		int count = 0;
		int sqr = (int) Math.sqrt(num);
		for (int i = 1; i <= sqr; i++)
		{
			if (num % i == 0)
				count++;
		}
		count += 2; // there are 2 number above the sqr which are also dividends
		return count;
	}
	
	public void findDivisor(int divisors)
	{
		System.out.println("Searching for triangle with " + divisors + " or more divisors...");
		for (int i = 0; i < size; i++)
		{
			if (i % 10000 == 0)
				System.out.println("Searching... " + i + " triangles checked...");
			if (listFactors(array[i]) >= divisors)
			{
				System.out.println("Triangle found: " + array[i]);
				break;
			}
		}
		System.out.println("Search done...");
	}
}