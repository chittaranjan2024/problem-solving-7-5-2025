package com.test;

/*
 * 234
 * 2+3+4=9
 */

/*
 * 234%10=4
 * 234/10=23%10=3
 */
public class SumOfDigits {
	
	public static int sumOfDigits(int num)
	{
		int rem=0,sum=0;
		
		for(;num>0;num=num/10)
		{
			rem=num%10;
			sum=sum+rem;
			
		}
		
		return sum;
	}

	public static void main(String[] args) {
		

		System.out.println(sumOfDigits(897));
	}

}

/*
 * Time complexity: O(log10(n))
 * Space complexity: O(1)
 */
