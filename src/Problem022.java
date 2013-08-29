import java.io.BufferedReader;
import java.io.FileReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;


public class Problem022
{
	private final int A = 1, B = 2, C = 3, D = 4, E = 5, F = 6, G = 7, H = 8, I = 9, J = 10, K = 11, L = 12, M = 13, N = 14, O = 15, P = 16, Q = 17, R = 18, S = 19, T = 20, U = 21, V = 22, W = 23, X = 24, Y = 25, Z = 26;
	private BigInteger sum = BigInteger.valueOf(0);
	
	public static void main(String[] args) throws Exception
	{
		new Problem022().run();
	}

	public void run() throws Exception
	{
		long begin = System.currentTimeMillis();
		BufferedReader br = new BufferedReader(new FileReader("src/problem022.in"));
		StringTokenizer token = new StringTokenizer(br.readLine());
		ArrayList<String> list = new ArrayList<String>();
		do
		{
			String str = token.nextToken(",");
			str = str.replaceAll("\"", "");
			list.add(str);
		}
		while (token.hasMoreTokens());
		Collections.sort(list);
		
		int size = list.size();
		for (int i = 0; i < size; i++)
		{
			sum = sum.add(BigInteger.valueOf(calcNumValue(list.get(i)) * (i + 1)));
		}
		System.out.println(sum.toString());
		long end = System.currentTimeMillis();
		System.out.println("Time taken: " + (end-begin) + " ms");	
	}
	
	public int calcNumValue(String string)
	{
		int res = 0;
		int size = string.length();
		for (int i = 0; i < size; i++)
		{
			Character c = string.charAt(i);
			if (c == 'A')
				res += A;
			else if (c == 'B')
				res += B;
			else if (c == 'C')
				res += C;
			else if (c == 'D')
				res += D;
			else if (c == 'E')
				res += E;
			else if (c == 'F')
				res += F;
			else if (c == 'G')
				res += G;
			else if (c == 'H')
				res += H;
			else if (c == 'I')
				res += I;
			else if (c == 'J')
				res += J;
			else if (c == 'K')
				res += K;
			else if (c == 'L')
				res += L;
			else if (c == 'M')
				res += M;
			else if (c == 'N')
				res += N;
			else if (c == 'O')
				res += O;
			else if (c == 'P')
				res += P;
			else if (c == 'Q')
				res += Q;
			else if (c == 'R')
				res += R;
			else if (c == 'S')
				res += S;
			else if (c == 'T')
				res += T;
			else if (c == 'U')
				res += U;
			else if (c == 'V')
				res += V;
			else if (c == 'W')
				res += W;
			else if (c == 'X')
				res += X;
			else if (c == 'Y')
				res += Y;
			else if (c == 'Z')
				res += Z;	
		}
		
		return res;
	}
}
