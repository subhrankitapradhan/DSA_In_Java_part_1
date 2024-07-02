/*
 Question Statement: 
1. You've to display the digits of a number.
2. Take as input "n", the number for which digits have to be displayed.
3. Print the digits of the number line-wise.
 */
package level1.GettingStarted;

import java.util.Scanner;

public class Digits_of_number {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int dig=0;
		int orgn = n;
		while(n!=0)
		{
			n= n/10;
			dig++;
		}
		int div = (int)(Math.pow(10, dig-1));
		while(div != 0)
		{
			int q = orgn/div;
			System.out.println(q);
			orgn=orgn%div;
			div = div/10;
		}
		sc.close();
	}
}
