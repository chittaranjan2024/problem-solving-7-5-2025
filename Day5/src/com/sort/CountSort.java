package com.sort;

import java.util.Arrays;

public class CountSort {
	
	public static void countSort(int arr[]){
		if(arr.length==0)
			return;
		
		//step 1: Find the max value to define the size of the count array
		int max=arr[0];
		
		for(int num:arr)
		{
			if(num>max)
			{
				max=num;
			}
		}
		
		//Step 2: create a count array
		int count[]=new int[max+1];
		
		//step 3: store frequency of each elements
		
		for(int num:arr)
		{
			count[num]++;
		}
		
		//step 4: Overwrite input array with sorted elements
		int index=0;
		for(int i=0;i<count.length;i++)
		{
			while(count[i]>0)
			{
				arr[index++]=i;
				count[i]--;
			}
		}
		
	}

	public static void main(String[] args) {
		
		int arr[]= {5,2,9,1,5,6};

		System.out.println(Arrays.toString(arr));
		
		countSort(arr);
		
		System.out.println(Arrays.toString(arr));

	}

}
