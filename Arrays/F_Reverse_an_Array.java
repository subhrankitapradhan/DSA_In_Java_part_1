package level1.arrays;

import java.util.Scanner;

public class F_Reverse_an_Array {
    public static void reverse_array(int[] arr)
    {
    	int i = 0;
    	int j = arr.length-1;
    	while(i < j)
    	{
    		int temp = arr[i];
    		arr[i]=arr[j];
    		arr[j]=temp;
    		i++;
    		j--;
    	}
    }
    public static void display(int[] arr)
    {
    	for(int i = 0 ;i<arr.length;i++)
    	{
    		System.out.print(arr[i]+" ");
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
        reverse_array(arr);
        display(arr);
		sc.close();

	}

}
