/*
Question Name:
Prime Factorization

Question Link: 
https://nados.io/question/prime-facto...

Question Statement: 
1. You are required to display the prime factorization of a number.
2. Take as input a number n.
3. Print all its prime factors from smallest to largest.
*/
package level1.GettingStarted;

import java.util.Scanner;

public class Prime_factorization {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int div = 2;div*div <= n;div++)
		{
			while(n%div == 0)
			{
				n=n/div;
				System.out.print(div+" ");
			}
		}
		if(n != 1)
		{
			System.out.print(n);
		}
		sc.close();
	}
}
