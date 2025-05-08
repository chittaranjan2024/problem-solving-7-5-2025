package com.test;

import java.util.Scanner;

//The factorial of a number n, written as n!, is the product of all positive integers less than or
//equal to n.

//5!=1*2*3*4*5 = 120
public class Factorial {
	
	public static long factorial(int n)
	{
		long result=1;//
		
		for(int i=1;i<=n;i++) //n
		{
			result=result*i;  //1*2*3*4*5
		}
		
		return result;
	}

	public static void main(String[] args) {
		int num=5;
		
		System.out.println(factorial(num));
		

	}

}

/*
 *Time complexity= O(n)
 *Space complexity=O(1)
*/