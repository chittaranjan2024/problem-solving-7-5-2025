package com.test;

public class FirstNonRepeatingCharacter {
	
	
	public static Character firstNonRepeatingChar(String st)
	{
		int freq[]=new int[256]; // assuming extended ASCII
		
		
		//step 1: count frequency of each character
		for(int i=0;i<st.length();i++)
		{
			freq[st.charAt(i)]++;
		}
		
		//step 2: find the first character with frequency 1
		for(int i=0;i<st.length();i++)
		{
			if(freq[st.charAt(i)]==1)
			{
				return st.charAt(i);
			}
		}
		
		
		return null;//no non repeating character
		
	}

	public static void main(String[] args) {
	 
		String input="programming";
		
			System.out.println(firstNonRepeatingChar(input));
		

	}

}
