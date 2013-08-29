import java.io.BufferedReader;
import java.io.FileReader;
import java.math.BigInteger;


public class Problem013
{
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new FileReader("src/problem013.in"));
		BigInteger sum = BigInteger.valueOf(0);
		do
		{
			sum = sum.add(new BigInteger(br.readLine()));
		}
		while (br.ready());
		
		System.out.println(sum.toString().substring(0, 10));
	}

}
