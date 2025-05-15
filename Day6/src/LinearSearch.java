
public class LinearSearch {
	
	public static int linearSearch(int arr[],int target)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==target)
			{
				return i;
			}
			
		}
		
		return -1;
	}

	public static void main(String[] args) {
		int arr[]= {7,3,45,12,87,22,34};
		
		System.out.println(linearSearch(arr, 99));
		

	}

}
