package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		System.out.println("What is the value of n?:");
		int n = in.nextInt();
		
		boolean[] nTrue = new boolean[n+1];
		int[] multiples = new int[n+1];
			for (int i = 0; i < multiples.length; i++)
			{
				multiples[i] = i;
				
			}
			
			for (int i = 0; i < n; i++)
			{
				nTrue[i] = true;
			}
			nTrue[1] = false;
			
			System.out.println(multiples[35]);
			System.out.println(nTrue[35]);
			System.out.println(nTrue[1]);
		
			
			for (int i = 2; i < n; i++)
			{
				int num1 = n/2;
				int num2 = 2*n;
				if (num1 == num2)
				{
					multiples[i] = 0;
				}
			}
			System.out.println(multiples[11]);
			
		

		
	}

}
