package com.test;

public class ReplaceCharacter {
	
	public static String replaceAllSpaces(String input)
	{
		String result="";
		if(input==null || input.length()==0)
		{
			return input;
		}
		
		for(int i=0;i<input.length();i++)
		{
			if(input.charAt(i)==' ')
			{
				result=result+"%20";
			}
			else
			{
			   result+=input.charAt(i);
			}
		}
		
		return result;
	}

	public static void main(String[] args) {
		
		String st="Mr John Smith";
		
		System.out.println(replaceAllSpaces(st));

	}

}
