/*
 * Two pointers technique
 * 
 * slow pointer: points to the last unique element in the array
 * fast pointer: scans the entire array
 */

import java.util.Arrays;

public class DuplicatesRemoval {
	public static int removeDuplicates(int nums[])
	{
		if(nums.length==0)
			return 0;
		
		
		int i=0;//slow pointer
		
		for(int j=i+1;j<nums.length;j++)
		{
			if(nums[j]!=nums[i])
			{
				i++;  //move slow pointer
				nums[i]=nums[j];//update position
			}
		}
		
		
		return i+1;//new length without any duplicates



}

	public static void main(String[] args) {
		
		int arr[]= {56,23,45,1,2,98,1,56,45,25,78};
		Arrays.sort(arr);
		
		System.out.println(Arrays.toString(arr));
		System.out.println();
		int newLength=removeDuplicates(arr);
	
		for(int i=0;i<newLength;i++)
		{
			System.out.print(arr[i]+" ");
		}
		

	}

}
