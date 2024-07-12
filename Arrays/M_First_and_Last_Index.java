package level1.arrays;

import java.util.Scanner;

public class M_First_and_Last_Index {
	public static void find_first_index_and_last_index(int[] arr,int data)
	{
		int low = 0;
		int high = arr.length-1;
		int fi = -1;
		while(low<=high)
		{
			int mid = (low+high)/2;
			if(data<arr[mid])
			{
				high = mid-1;
			}
			else if(data>arr[mid])
			{
				low = mid+1;
			}
			else
			{
				fi = mid;
				high = mid-1;
			}
		}
		System.out.println("First Index : "+fi);
		low = fi;
		high = arr.length-1;
		int li = -1;
		while(low<=high)
		{
			int mid = (low+high)/2;
			if(data<arr[mid])
			{
				high = mid-1;
			}
			else if(data>arr[mid])
			{
				low = mid+1;
			}
			else
			{
				li = mid;
				low = mid+1;
			}
		}
		System.out.println("Last Index : "+li);
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
		int data = sc.nextInt();
		find_first_index_and_last_index(arr,data);
		sc.close();
	}

}
