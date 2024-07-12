package level1.arrays;

import java.util.Scanner;

public class K_Binary_Search {
	public static int binary_search(int[] arr,int key,int low,int high)
    {
    	while(low<=high)
    	{
    		int mid = (low+high)/2;
    		if(arr[mid]==key)
    		{
    			return mid;
    		}
    		else if(arr[mid]>key)
    		{
    			return binary_search(arr,key,low,mid-1);
    		}
    		else
    		{
    			return binary_search(arr,key,mid+1,high);
    		}
    	}
    	return -1;
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
		int key = sc.nextInt();
		int idx = binary_search(arr,key,0,arr.length-1);
		System.out.println(idx+" ");
		sc.close();

	}

}
