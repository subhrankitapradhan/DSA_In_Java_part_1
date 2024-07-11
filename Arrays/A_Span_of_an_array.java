package level1.arrays;

import java.util.Scanner;

public class A_Span_of_an_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr= new int[n];
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for(int i = 0 ; i < n ; i++)
		{
			arr[i] = sc.nextInt();
			if(arr[i]>max)
			{
				max=arr[i];
			}
			if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		int span = max-min;
		System.out.println(span);		
		sc.close();
	}

}
