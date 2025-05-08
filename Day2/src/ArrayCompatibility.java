


/*
 * i)They are of the same length
 * ii)Each element in the first array is greater than or equal to the corresponding element of the second array 
 *[5 7 9]
 *[3 7 8]
 *
 *
 *[5 6 4]
 *[5 6 5]
 */
public class ArrayCompatibility {

	public static boolean areCompitable(int arr1[],int arr2[])
	{
		if(arr1.length!=arr2.length	)
			return false;
		
		for(int i=0;i<arr1.length;i++)
		{
			if(arr1[i]<arr2[i])
			{
				return false;
			}
		}
		
		
		return true;	
	}
	
	public static void main(String[] args) {
	
		int arr1[]= {5,6,4};
		int arr2[]= {5,6,5};
		
		if(areCompitable(arr1, arr2))
		{
			System.out.println("Arrays are compitable");
		}
		else
		{
			System.out.println("Arrays are not compitable");
		}

	}

}
