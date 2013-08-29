
public class Problem004
{
	public static void main(String[] args)
	{
		String product;
		boolean palindrome;
		int biggestProduct = 0;
		for (int i = 100; i < 1000; i++)
		{
			for (int j = 100; j < 1000; j++)
			{
				product = Integer.toString(i * j);
				int size = product.length();

				if (product.charAt(0) == product.charAt(size-1))
				{
					if (product.charAt(1) == product.charAt(size-2))
					{
						if (product.charAt(2) == product.charAt(size-3))
						{
							palindrome = true;
							
							if (Integer.parseInt(product) > biggestProduct)
							{
								biggestProduct = Integer.parseInt(product);
							}
						}
					}
				}
				else
					palindrome = false;
			}
		}

		System.out.println(biggestProduct);
	}
}
