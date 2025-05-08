import java.util.Arrays;

public class Search {

	public static int binarySearch(int []arr,int key)
	{
		Arrays.sort(arr);
		
		int lower=0,upper=arr.length-1;
		
		while(lower<=upper)
		{
			int mid=lower+(upper-lower)/2;  //mid without causing overflow
			
			if(key==arr[mid])
			{
				return mid;
			}
			else if(arr[mid]<key)
			{
				lower=mid+1;
			}
			else if(arr[mid]>key)
			{
				upper=mid-1;
			}
		}
		
		return -1;
		
	}
	
	
	
	public static int linearSearch(int arr[],int target)
	{
		
		for(int i=0;i<arr.length-1;i++)
		{
			if(target==arr[i])
			{
				
				return i;
			}
		}
		
		return -1;
	}
	public static void main(String[] args) {
		
		int arr[]= {56,23,45,1,2,98,25,78};
		System.out.println(binarySearch(arr, 99));
		System.out.println(binarySearch(arr, 98));
		
		System.out.println(linearSearch(arr, 78));
		System.out.println(linearSearch(arr, 77));
	}

}

/*
 * Linear Search: O(n)
 * Binary Search:O(logn)
 */
 

