package com.test;

import java.util.Arrays;

public class AnagramChecker {

	public static boolean isAnagram(String s1,String s2)
	{
		if(s1.length()!=s2.length())
			return false;
		
		char s1Array[]=s1.toCharArray();
		char s2Array[]=s2.toCharArray();
		
		
		Arrays.sort(s1Array);
		Arrays.sort(s2Array);
		
		//System.out.println(Arrays.toString(s1Array));
		//System.out.println(Arrays.toString(s2Array));
		return Arrays.equals(s1Array, s2Array);
	}
	
	
	public static void main(String[] args) {
	
		String st1="LISTEN";
		String st2="SILETT";
		
		if(isAnagram(st1, st2))
		{
			System.out.println("Anagram");
		}
		else
		{
			System.out.println("Non-Anagram");
		}
		
		
		

	}

}
