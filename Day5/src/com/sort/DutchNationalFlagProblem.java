package com.sort;

import java.util.Arrays;

public class DutchNationalFlagProblem {
	
	public static void sortColors(int nums[])
	{
		int low=0, mid=0, high=nums.length-1;
		
		while(mid<=high)
		{
			if(nums[mid]==0)
			{
				int temp=nums[low];
				nums[low]=nums[mid];
				nums[mid]=temp;
				low++;
				mid++;
			}
			if(nums[mid]==1)
			{
				mid++;
			}
			else if(nums[mid]==2)
			{
				int temp=nums[mid];
				nums[mid]=nums[high];
				nums[high]=temp;
				high--;
			}
		}
		
	}

	public static void main(String[] args) {
		int arr[]= {2,0,2,1,1,0};
		System.out.println(Arrays.toString(arr));	
		sortColors(arr);
		System.out.println(Arrays.toString(arr));

	}

}
