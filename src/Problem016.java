import java.math.BigInteger;


public class Problem016
{
	private int[] array;
	private BigInteger bigInt;

	public static void main(String[] args) {
		new Problem016().run();
	}

	public void run()
	{
		calcSum(calcPow(2, 1000));
		printArray();
	}

	public BigInteger calcPow(int num, int pow)

	{	
		bigInt = BigInteger.valueOf(num).pow(pow);
		System.out.println(bigInt);
		return bigInt;
	}

	public int[] calcSum(BigInteger num)
	{
		String string = num.toString();
		int size = string.length();
		array = new int[size];

		for (int i = 0; i < size; i++)
		{
			Character c = string.charAt(i);
			String str = c.toString();
			if (!str.equals("."))
				array[i] = Integer.parseInt(c.toString());
		}
		return array;
	}

	public void printArray()
	{
		int sum = 0;
		int size = array.length;
		for (int i = 0; i < size; i++)
		{
			sum += array[i];
		}
		System.out.println(sum);
	}
}