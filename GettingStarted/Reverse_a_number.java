/*
 Question Statement: 

1. You've to display the digits of a number in reverse.
2. Take as input "n", the number for which digits have to be display in reverse.
3. Print the digits of the number line-wise, but in reverse order.
*/

package level1.GettingStarted;

import java.util.Scanner;

public class Reverse_a_number {
	
	public static void main(String[] args) 
	{
		
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		while(n>0)
		{
			int rem = n%10;
			System.out.println(rem);
			n= n/10;
		}
		sc.close();
	}
}
