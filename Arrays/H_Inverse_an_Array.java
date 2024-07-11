package level1.arrays;

import java.util.Scanner;

public class H_Inverse_an_Array {
    public static int[] inverse(int[] a)
    {
    	int[] inv = new int[a.length];
    	for(int i=0;i<a.length;i++)
    	{
    		int j = a[i];
    		inv[j] = i;
    	}
    	return inv;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		int[] inv = inverse(arr);
		for(int val : inv)
		{
			System.out.print(val+" ");
		}
		sc.close();
	}

}
