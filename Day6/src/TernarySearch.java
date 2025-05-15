import java.util.Arrays;

public class TernarySearch {
	public static int ternarySearch(int arr[],int l,int r,int key)
	{
		if(l<=r)
		{
			int mid1=l+(r-l)/3;
			int mid2=r-(r-l)/3;
			
			if(arr[mid1]==key) return mid1;
			if(arr[mid2]==key) return mid2;
			
			if(key<arr[mid1])
			{
				return ternarySearch(arr, l, mid1-1, key);
			}
			else if(key>arr[mid2])
			{
				return ternarySearch(arr, mid2+1, r, key);
			}
			else
			{
				return ternarySearch(arr, mid1+1, mid2-1, key);
			}
			
		}
		
		return -1;
	}
	
	
	public static void main(String[] args) {
		int arr[]= {7,3,45,12,87,22,34};
		Arrays.sort(arr);
		
		System.out.println(ternarySearch(arr, 0, arr.length-1, 34));
		System.out.println(ternarySearch(arr, 0, arr.length-1, 78));

	}

}

/*
*time complexity:O(log3N)
*/
