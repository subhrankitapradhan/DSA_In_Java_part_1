package level1.arrays;

import java.util.Scanner;

public class C_Bar_Chart {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n  = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0;i<arr.length;i++)
		{
			arr[i] = sc.nextInt();
		}
		int max = Integer.MIN_VALUE;
		for(int i = 0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		for(int floor = max;floor>=1;floor--)
		{
			for(int i = 0;i<arr.length;i++)
			{
				if(arr[i]>=floor)
				{
					System.out.print("*\t");
				}
				else
				{
					System.out.print("\t");
				}
			}
			System.out.println();
		}
		sc.close();
	}
}
