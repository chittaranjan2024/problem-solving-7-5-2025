package com.sort;import java.util.Arrays;

public class QuickSort {

	
	public static void quickSort(int arr[],int low,int high)
	{
		if(low<high)
		{
			//Get the pivot index after the partitioning
			int pivotIndex=partition(arr, low, high);
			
			quickSort(arr, low, pivotIndex-1);//left of pivot
			quickSort(arr, pivotIndex+1, high);//right of pivot
			
		}
	}
	
	
	private static int partition(int arr[],int low,int high)
	{
		int pivot=arr[high];
		int i=low-1;  //-1
		
		//if current element if equal or smaller than the pivot
		for(int j=low;j<high;j++)
		{
			if(arr[j]<=pivot)
			{
				i++;
				swap(arr,i,j);
			}
		}
		
		swap(arr,i+1,high);//swap pivot element with element at i+1
		return i+1;//return pivot index
	}
	
	private static void swap(int arr[],int i,int j)
	{
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	public static void main(String[] args) {
		int arr[]= {10,7,8,9,1,5};
		int n=arr.length;
		
		
	System.out.println(Arrays.toString(arr));
	
	quickSort(arr, 0, n-1);
	
	System.out.println(Arrays.toString(arr));
		
		
	}

}
/*
  Time complexity: O(n logn)
 * Space complexity: O(logn)
*/