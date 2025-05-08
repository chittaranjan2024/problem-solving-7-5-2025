package com.test;

import java.util.Scanner;

public class CountVowelsInAString {
	
	private static int countVowels(String st)
	{
		st=st.toLowerCase();
		int count=0;
		for(int i=0;i<st.length();i++)
		{
			char ch=st.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				++count;
			}
		}
		
		return count;
	}

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a string:");
		String st=scanner.nextLine();
		
		System.out.println(countVowels(st));
		

	}

}
