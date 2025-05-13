package com.test;
import java.util.*;

public class CombinationSum {

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates);  // Sort the candidates to handle duplicates and improve efficiency
        backtrack(candidates, target, 0, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int[] candidates, int target, int start, List<Integer> current, List<List<Integer>> result) {
        if (target == 0) {  // If we have found a valid combination
            result.add(new ArrayList<>(current));
            return;
        }
        
        for (int i = start; i < candidates.length; i++) {
            // Skip duplicates: if this number is the same as the previous one, skip it
            if (i > start && candidates[i] == candidates[i - 1]) {
                continue;
            }
            
            // If the current candidate exceeds the target, no point in continuing with further candidates
            if (candidates[i] > target) {
                break;
            }
            
            // Choose the current candidate
            current.add(candidates[i]);
            // Recurse with the remaining target and the next index (i+1 to avoid reusing the same element)
            backtrack(candidates, target - candidates[i], i + 1, current, result);
            // Backtrack: remove the last added element
            current.remove(current.size() - 1);
        }
    }

    public static void main(String[] args) {
        CombinationSum solution = new CombinationSum();
        int[] candidates = { 1, 2,7, 5};
        int target = 8;
        List<List<Integer>> result = solution.combinationSum2(candidates, target);
        
        // Print the result
        for (List<Integer> combination : result) {
            System.out.println(combination);
        }
    }
}
