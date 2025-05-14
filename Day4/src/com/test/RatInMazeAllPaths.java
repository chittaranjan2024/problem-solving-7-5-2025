package com.test;

import java.util.*;

public class RatInMazeAllPaths {

    // Directions: D, L, R, U
    static int[] dx = {1, 0, 0, -1};
    static int[] dy = {0, -1, 1, 0};
    static char[] dir = {'D', 'L', 'R', 'U'};

    // Check if a move is valid
    public static boolean isSafe(int[][] maze, int x, int y, boolean[][] visited) {
        return (x >= 0 && y >= 0 && x < maze.length && y < maze[0].length &&
                maze[x][y] == 1 && !visited[x][y]);
    }

    // Recursive function to explore all paths
    public static void findPaths(int[][] maze, int x, int y, boolean[][] visited, String path, List<String> result) {
        int n = maze.length;

        // Base case: destination reached
        if (x == n - 1 && y == n - 1) {
            result.add(path);
            return;
        }

        // Mark current cell as visited
        visited[x][y] = true;

        // Try all 4 directions
        for (int i = 0; i < 4; i++) {
            int newX = x + dx[i];
            int newY = y + dy[i];
            char move = dir[i];

            if (isSafe(maze, newX, newY, visited)) {
                findPaths(maze, newX, newY, visited, path + move, result);
            }
        }

        // Backtrack: Unmark the current cell
        visited[x][y] = false;
    }

    public static List<String> getAllPaths(int[][] maze) {
        List<String> result = new ArrayList<>();
        int n = maze.length;

        if (maze[0][0] == 0 || maze[n - 1][n - 1] == 0)
            return result; // No path possible

        boolean[][] visited = new boolean[n][n];
        findPaths(maze, 0, 0, visited, "", result);
        return result;
    }

    public static void main(String[] args) {
        int[][] maze = {
            {1, 0, 0, 0},
            {1, 1, 0, 1},
            {0, 1, 0, 0},
            {1, 1, 1, 1}
        };

        List<String> allPaths = getAllPaths(maze);

        if (allPaths.isEmpty()) {
            System.out.println("No path exists");
        } else {
            System.out.println("All possible paths:");
            for (String path : allPaths) {
                System.out.println(path);
            }
        }
    }
}

