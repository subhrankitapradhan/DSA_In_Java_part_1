/*
Question Name:
Pythagorean Triplets
Question Statement: 
1. You are required to check if a given set of numbers is a valid pythagorean triplet.
2. Take as input three numbers a, b and c.
3. Print true if they can form a pythagorean triplet and false otherwise.
*/

package level1.GettingStarted;

import java.util.Scanner;

public class Pythagorean_triplets {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int max = (a>b && a>c) ?  a : ((b>c)? b : c);
		boolean flag = (max == a) ? (b*b+c*c==a*a) : ((max==b)? (a*a+c*c==b*b):((max==c)?(a*a+b*b==c*c):false));
		System.out.println(flag);
		sc.close();

	}

}
