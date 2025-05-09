package com.test;

public class StringCompression {

	public static String compress(String st)
	{
		
		if(st==null || st.length()==0)
		{
			return st;
		}
		
		
		StringBuilder compressed=new StringBuilder();
		
		int count=1;
		
		for(int i=1;i<st.length();i++)
		{
			if(st.charAt(i)==st.charAt(i-1))
			{
				++count;
			}
			else
			{
				compressed.append(st.charAt(i-1));
				compressed.append(count);
				count=1;
			}
			
		}
		
		compressed.append(st.charAt(st.length()-1));	
		compressed.append(count);
		
		
		return compressed.length()<st.length()?compressed.toString():st;
	}
	
	public static void main(String[] args) {
		String s1="aabbbbbbcccccccc";
		
		System.out.println(compress(s1));

	}

}
