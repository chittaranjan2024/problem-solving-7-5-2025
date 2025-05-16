package com.test;

import java.util.Stack;

public class BalancedParenthesesChecker {

	public static boolean isBalanced(String expression)
	{
		Stack<Character> stack=new Stack<Character>();
		
		for(char ch:expression.toCharArray())
		{
			if(ch=='('||ch=='{'||ch=='[')
			{
				stack.push(ch);
			}
			else if(ch==')'||ch=='}'||ch==']')
			{
				if(stack.isEmpty())
				{
					return false;
				}
				
				char top=stack.pop();
				
				if(!isMatchingPair(top, ch))
				{
					return false;
				}
			}
		}
		
		return stack.isEmpty();
		
	}
	
	private static boolean isMatchingPair(char open, char close)
	{
		return (open=='(' && close==')') ||
			   (open=='{' && close=='}') ||
			   (open=='[' && close==']');
	}
	
	
	public static void main(String[] args) {
		
		String test1="{[()]}";
		String test2="{[(])}";
		String test3="([)]";
		
		System.out.println(isBalanced(test1));
		System.out.println(isBalanced(test2));
		System.out.println(isBalanced(test3));
		

	}

}
