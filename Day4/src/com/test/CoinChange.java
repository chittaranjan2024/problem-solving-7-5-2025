package com.test;

public class CoinChange {
	
	public static int coinChange(int coins[],int amount)
	{
		int dp[]=new int[amount+1];
		
		for(int i=0;i<=amount;i++)
		{
			dp[i]=amount+1; //each dp[i] will mean the minimum coins required to make amount i
		}
		
		
		dp[0]=0;//base case
		
		for(int i=1;i<=amount;i++)
		{
			for(int coin:coins)
			{
				if(i>=coin)
				{
					dp[i]=Math.min(dp[i], dp[i-coin]+1);
				}
			}
		}
		
		return dp[amount]>amount?-1:dp[amount];
		
		
		
	}

	public static void main(String[] args) {
	
		int coins[]= {1,2,5};
		int amount=56;
		
		System.out.println(coinChange(coins, amount));

	}

}
