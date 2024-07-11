package level1.arrays;

import java.util.Scanner;

public class B_Find_element_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++)
        {
        	arr[i]=sc.nextInt();
        }
        int x = sc.nextInt();
        int idx =-1;
        for(int i = 0;i<n;i++)
        {
        	if(x==arr[i])
        	{
        		idx = i;
        		break;
        	}
        }
        System.out.println(idx);
        sc.close();
	}

}
