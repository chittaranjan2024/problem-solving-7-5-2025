import java.util.Arrays;

public class BinarySearch {
	
	public static int binarySearch(int arr[],int low,int high,int target)
	{
		if(low>high)
		{
			return -1;
		}
		
		int mid=low+(high-low)/2;
		
		
		if(target==arr[mid])
		{
			return mid;
		}
		
		else if(arr[mid]>target)
		{
			return binarySearch(arr, low, mid-1, target);
		}
		else
		{
			return binarySearch(arr, mid+1, high, target);
		}
	}

	public static void main(String[] args) {
		
		int arr[]= {7,3,45,12,87,22,34};
		Arrays.sort(arr);
		
		System.out.println(binarySearch(arr, 0, arr.length-1, 34));
		System.out.println(binarySearch(arr, 0, arr.length-1, 78));
		

	}

}
