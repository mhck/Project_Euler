public class Problem006
{
	public static void main(String[] args)
	{
		double sumsq = 0;
		double sqsum = 0;
		int upperlimit = 100;

		for (int i = 1; i <= upperlimit; i++)
		{
			sumsq += Math.pow(i, 2);

		}

		for (int i = 1; i <= upperlimit; i++)
		{
			sqsum += i;
		}
		sqsum = Math.pow(sqsum, 2);

		System.out.format("Difference = %.0f", calcDifference(sqsum, sumsq));
	}
	
	public static double calcDifference(double x, double y)
	{
		double res;
		if (x - y >= 0)
			res = x - y;
		else
			res = y - x;
		return res;
	}
}
