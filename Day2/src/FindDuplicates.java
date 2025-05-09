import java.util.HashSet;
import java.util.Set;

public class FindDuplicates {
	
	public static void findDuplicate(int arr[])
	{
		Set<Integer> seen=new HashSet<Integer>();
		Set<Integer> duplicates=new HashSet<Integer>();
		
		for(int num:arr)//O(n)
		{
			if(!seen.add(num))//O(n)
			{
				//If add returns false, it means num is already present
				duplicates.add(num);
			}
		}
		
		
		if(duplicates.isEmpty())//O(1)
		{
			System.out.println("No repeating elements found!!");
		}
		else
		{
			System.out.println("Dplicate elements:"+duplicates);
		}
	}

	public static void main(String[] args) {
		
		int arr[]= {1,3,2,7,8,2,3,1};
		findDuplicate(arr);
		

	}

}
