public class Problem019
{
	private int days;
	private int n = 2;
	private int count = 0;

	public static void main(String[] args) {
		new Problem019().run();
	}

	public void run()
	{
		for (int year = 1901; year <= 2000; year++)
		{
			for (int month = 1; month <= 12; month++)
			{
				if (month == 2)
				{
					if (year % 100 == 0)
						days = 29;
					else if (year % 100 != 0 && year % 4 == 0)
						days = 29;
					else
						days = 28;
				}

				else if (month == 4 || month == 6 || month == 9 || month == 11)
					days = 30;

				else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
					days = 31;

				for (int day = 1; day <= days; day++)
				{
					if (n == 8)
						n = 1;
					if (n == 7 && day == 1)
					{
						System.out.println("Sunday found... Year: " + year + ", month: " + month + ", day: " + day);
						count++;
					}
					n++;
				}
			}
		}
		System.out.println(count);
	}
}