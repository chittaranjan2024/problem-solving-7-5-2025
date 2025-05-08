package com.test;

import java.util.Scanner;

/*
 * a b next
 * 0 1 1 2 3 5 8 ......
 */
public class FibonacciSeries {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the value of n:");
		int n=scanner.nextInt();
		
		
		System.out.println("Fibinacci number upto "+n+" :");
		int a=0,b=1;
		
		for(;a<=n;)
		{
			System.out.print(a+" ");
			int next=a+b;
			a=b;
			b=next;
		}
		
		scanner.close();

	}

}
