import java.io.BufferedReader;
import java.io.FileReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;


public class Problem022_v2
{
	private final int A = 1, B = 2, C = 3, D = 4, E = 5, F = 6, G = 7, H = 8, I = 9, J = 10, K = 11, L = 12, M = 13, N = 14, O = 15, P = 16, Q = 17, R = 18, S = 19, T = 20, U = 21, V = 22, W = 23, X = 24, Y = 25, Z = 26;
	private int sum = 0, pos = 0;
	
	public static void main(String[] args) throws Exception
	{
		new Problem022_v2().run();
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
			pos++;
			int pSum = 0;
			int pSize = list.get(i).length();
			for (int j = 0; j < pSize; j++)
			{
				pSum += list.get(i).charAt(j) - 64;
			}
			sum += (pSum * pos);
		}
		System.out.println(sum);
		long end = System.currentTimeMillis();
		System.out.println("Time taken: " + (end-begin) + " ms");	
	}
}
