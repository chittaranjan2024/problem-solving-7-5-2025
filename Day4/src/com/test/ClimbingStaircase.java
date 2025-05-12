package com.test;
/*
 * 
 */
public class ClimbingStaircase {

	public static int climbStaircaseRecursive(int n)
	{
		if(n<=1) 
		 return 1;
		
		return climbStaircaseRecursive(n-1)+climbStaircaseRecursive(n-2);
		
		
	}
	
	public static int climbStairsMemo(int n)
	{
		int memo[]=new int[n+1];//n=5  step-0,1,2...5
		return climb(n,memo);
	}
	
	private static int climb(int n,int memo[])
	{
		if(n<=1) return 1;
		if(memo[n]!=0) return memo[n];
		memo[n]=climb(n-1, memo)+climb(n-2, memo);
		return memo[n];
		
 	}
	public static void main(String[] args) {

		
		System.out.println(climbStaircaseRecursive(3));
		System.out.println(climbStaircaseRecursive(4));
		
		System.out.println(climbStairsMemo(4));
	}

}
