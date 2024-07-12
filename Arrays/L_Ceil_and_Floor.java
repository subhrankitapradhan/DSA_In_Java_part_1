package level1.arrays;

import java.util.Scanner;

public class L_Ceil_and_Floor {
    public static void find_ceil_and_floor(int[] arr,int key)
    {
    	int low = 0;
    	int high = arr.length-1;
    	int ceil = 0;
    	int floor = 0;
    	while(low<=high)
    	{
    		int mid = (low+high)/2;
    		if(arr[mid]>key)
    		{
    			high = mid-1;
    			floor=arr[mid];
    		}
    		else if(arr[mid]<key)
    		{
    			low = mid+1;
    			ceil=arr[mid];
    		}
    		else	
    		{
    			ceil=arr[mid];
    			floor=arr[mid];
    			break;
    		}
    	}
    	System.out.println("Ceil is :"+ceil+" ");
    	System.out.println("Floor is :"+floor+" ");
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
		find_ceil_and_floor(arr,key);
		sc.close();

	}

}
