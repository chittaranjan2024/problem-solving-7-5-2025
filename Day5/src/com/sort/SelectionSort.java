package com.sort;

import java.util.Arrays;

public class SelectionSort {
	
	public static void selectionSort(int arr[])
	{
		int n=arr.length;
		
		for(int i=0;i<n-1;i++)
		{
			int minIndex=i;
			
			for(int j=i+1;j<n;j++)
			{
				if(arr[j]<arr[minIndex])
				{
					minIndex=j;
				}
			}
			
			//swap the found minimum element with the first element
			int temp=arr[minIndex];
			arr[minIndex]=arr[i];
			arr[i]=temp;
			
		}
	}

	public static void main(String[] args) {
		int arr[]= {5,2,9,1,5,6};
		

		System.out.println(Arrays.toString(arr));
		
		selectionSort(arr);
		
		System.out.println(Arrays.toString(arr));

	}

}
