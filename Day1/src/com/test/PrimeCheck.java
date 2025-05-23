package com.test;

import java.util.Scanner;

public class PrimeCheck {
	
	private static boolean isPrime(int num)
	{
		if(num<=1) return false;//0 and 1 are not Prime
		if(num==2)return true;//2 is the only even Prime number
		if(num%2==0) return false;//eliminate other even numbers
		
		
		for(int i=3;i<=Math.sqrt(num);i=i+2)//O(Vn)
		{
			if(num%i==0) 
			 return false;
		}
		
		return true;
	}

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in); 
		int num=scanner.nextInt();
		
		if(isPrime(num))
		{
			System.out.println(num+" is a Prime Number");
		}
		else
		{
			System.out.println(num+" is not a Prime Number");
		}

	}

}

//time complexity: O(vn)
//space complexity:O(1)
