package level1.arrays;

import java.util.Scanner;

public class G_Rotate_an_Array {
    public static void  reverse(int[] arr,int i,int j)
    {
    	int li = i;
    	int ri = j;
    	while(li<ri)
    	{
    		int temp = arr[li];
    		arr[li] = arr[ri];
    		arr[ri] = temp;
    		li++;
    		ri--;	
    	}
    }
    public static void rotate(int[] arr,int k)
    {
    	k = k%arr.length;
    	if(k<0)
    	{
    		k= k+arr.length;
    	}
    	//part1
    	reverse(arr,0,arr.length-k-1);
    	
    	//part2
    	reverse(arr,arr.length-k,arr.length-1);
    	
    	//part3
    	reverse(arr,0,arr.length-1);
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
		for(int i = 0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		rotate(arr,2);
		System.out.println();
		sc.close();

	}
}
