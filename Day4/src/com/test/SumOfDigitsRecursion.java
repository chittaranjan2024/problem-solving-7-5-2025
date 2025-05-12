package com.test;

public class SumOfDigitsRecursion {

	public static int sumOfDigits(int n)
	{
		if(n==0)
		 return 0;
		else
		  return n%10+sumOfDigits(n/10);	
	}
	public static void main(String[] args) {
		
		System.out.println(sumOfDigits(783));

	}

}
