
public class Problem012_v2
{
	private int x;
	private int n = 1;
	private int i = 2;
	private int divisor = 2;
	
	public static void main(String[] args)
	{
		new Problem012_v2().run();
	}
	
	public void run()
	{
		while (divisor < 250)
		{
			n += i;
			x = 1;
			divisor = 0;
			while (x < Math.sqrt(n))
			{
				if (n % x == 0)
					divisor += 1;
				x += 1;
			}
			i += 1;
		}
		System.out.println(n);
	}
}
