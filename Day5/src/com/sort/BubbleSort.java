package com.sort;

import java.util.Arrays;

public class BubbleSort {
	
	public static void bubbleSort(int arr[])
	{
		int n=arr.length;
		boolean swapped=false;
		
		for(int i=0;i<n-1;i++)//n
		{
			for(int j=0;j<n-1-i;j++)//n*n
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					
					swapped=true;
					
				}
			}
			
			if(!swapped)
				break;
		}
		
	}

	public static void main(String[] args) {
		int arr[]= {5,2,9,1,5,6};
		

		System.out.println(Arrays.toString(arr));
		
		bubbleSort(arr);
		
		System.out.println(Arrays.toString(arr));
	}

}
