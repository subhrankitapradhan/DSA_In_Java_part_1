/*
Question Name:
Rotate a number
Question Statement: 
1. You are given two numbers n and k. You are required to rotate n, k times to the right. If k is positive, rotate to the right i.e. remove rightmost digit and make it leftmost. Do the reverse for negative value of k. Also k can have an absolute value larger than number of digits in n.
2. Take as input n and k.
3. Print the rotated number.
4. Note - Assume that the number of rotations will not cause leading 0's in the result. e.g. such an input will not be given
   n = 12340056
   k = 3
   r = 05612340
 */
package level1.GettingStarted;

import java.util.Scanner;

public class Rotate_a_number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int count = 0;
		int rotated_num = 0;
		int temp = n;
		while(temp!=0)
		{
			temp = temp/10;
			count++;
		}
		k=k%count;
		if(k<0)
		{
			k=k+count;
		}
		int div = 1;
		int mul = 1;
		for(int i = 1;i<=count;i++)
		{
			if(i<=k)
			{
				div = div*10;
			}
			else
			{
				mul = mul*10;
			}
		}
		//int div = (int) Math.pow(10,k);
		//int mul = (int) Math.pow(10,count-k);
		int rem = n%div;
		int q = n/div;
		rotated_num = rem*mul + q ;
		System.out.println(rotated_num);
		sc.close();
	}
}
