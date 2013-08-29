
public class Problem014
{
	private int highestStartingNum = 0;
	private int highestChain = 0;

	public static void main(String[] args) {
		new Problem014().run();
	}

	public void run()
	{
		for (int i = 1; i <= 1000000; i++) // Find for the first 1*10^6 numbers
		{
			System.out.println("Trying " + i + ". Current highest chain: " + highestChain + ", with starting number: " + highestStartingNum);
			if (sequence(i) > highestChain)
			{
				highestStartingNum = i;
				highestChain = sequence(i);
			}
		}
//		System.out.println("Highest chain: " + highestChain + ", Starting number: " + highestStartingNum);
	}

	public int sequence(long num)
	{
		int chain = 1;
		do
		{
			if (num == 1)
				return chain;
			if (num % 2 == 0)
			{
				num /= 2;
				chain++;
			}
			else
			{
				num = (num * 3) + 1;
				chain++;
			}
		}
		while (num != 1);
		return chain;	
	}
}
