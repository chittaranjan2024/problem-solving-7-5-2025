package com.test;
/*
 * 0 1 1 2
 */
public class FibonacciSeriesUsingRecursion {
	
	public static int fibonacci(int n)
	{
		if(n==0)
			return 0;  //base case
		else if(n==1)
			return 1; //base case
		else
			return fibonacci(n-1)+fibonacci(n-2); //recursive calls
	}
	
	
	public static void main(String args[])
	{
		int terms=10;
		
		for(int i=0;i<terms;i++)
		{
			System.out.print(fibonacci(i)+" ");   //fabo(4)  fibo(3)
		}
		
		
	}
	
	

}

/*
 * time complexity: O(2n)
 *   
*/