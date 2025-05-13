package com.test;

public class RatInAMaze {

	public static boolean isSafe(int maze[][],int x,int y, int solution[][])
	{
		return (x>=0 && y>=0 && x<maze.length && y<maze[0].length && maze[x][y]==1 && solution[x][y]==0);
	}
	
	
	public static boolean solveMaze(int maze[][],int x,int y,int [][]solution)
	{
		//Base case: If we reach the destination (n-1,n-1)
		if(x==maze.length-1 && y==maze[0].length-1)
		{
			solution[x][y]=1;
			return true;
		}
		
		if(isSafe(maze, x, y, solution))
		{
			solution[x][y]=1;
			//Move down
			if(solveMaze(maze, x+1, y, solution))
			{
				return true;
			}
			
			//Move right
			if(solveMaze(maze, x, y+1, solution))
			{
				return true;
			}
			
			//move up
			if(solveMaze(maze, x-1, y, solution))
			{
				return true;
			}
			//move left
			if(solveMaze(maze, x, y-1, solution))
			{
				return true;
			}
			//backtracking
			solution[x][y]=0;
			return false;
			
		}
		return false; 
	}
	
	
	public static void printSolution(int solution[][])
	{
		for(int i=0;i<solution.length;i++)
		{
			for(int j=0;j<solution[0].length;j++)
			{
				System.out.print(solution[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) 

	{
		int maze[][]= {
				{1,0,0,0},
				{1,1,1,1},
				{0,1,0,1},
				{1,1,1,1}
		};
		
		int result[][]=new int[maze.length][maze[0].length];


		if(solveMaze(maze, 0, 0, result))
		{
			System.out.println("Solution Path:");
			printSolution(result);
		}
		else
		{
			System.out.println("No solution path exists!");
		}

	}

}
