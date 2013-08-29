/**
 * PROJECT EULER: PROBLEM 9
 * http://projecteuler.net/problem=9
 * 
 * ------------------------------------
 * A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
 * a2 + b2 = c2
 * 
 * For example, 32 + 42 = 9 + 16 = 25 = 52.
 * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
 * Find the product abc.
 * -------------------------------------
 *
 * @author Mads Heckmann
 *
 * ---------------------------
 * Se http://en.wikipedia.org/wiki/Pythagorean_triple for teori.
 * ---------------------------
 * Find en trekant hvis sum går op i 1000. Skalér derefter med faktor k for at få de ønskede sider.
 * 
 * 		a = k * m²-n²
 * 		b = k * 2mn
 * 		c = k * m² + n²
 * Hvor k, m, n er positive heltal og m > n
 * 
 * Man kan dermed nøjes at lede efter n og m indtil man finder en trekant, hvor sum modulus sidernes længde har en rest på 0.
 * 		1000 % (a+b+c) == 0
 */
public class Problem009
{

	public static void main(String[] args)
	{
		System.out.println(run(1000));
	}

	public static int run(int i)
	{
		for (int m = 2; m < i; m++)
		{
			for (int n = 1; n < m; n++)
			{
				int a = m * m - n * n;
				int b = 2 * m * n;
				int c = m * m + n * n;
				if (i % (a + b + c) == 0)
				{
					int k = (i / (a + b + c));
					int res = k * a * k * b * k * c;
					if (res > 0)
						return res;
				}
			}
		}
		return 0;
	}
}
