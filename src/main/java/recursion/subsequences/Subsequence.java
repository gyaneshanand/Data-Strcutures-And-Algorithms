package recursion.subsequences;

import java.util.ArrayList;

public class Subsequence {

    static void getSubsequence(int ind, ArrayList<Integer> arr, int n[] , int len , ArrayList<ArrayList<Integer>> result ) {
        if(ind == len) {

            // If we would have simply done result.add(arr) here the ref to arr will be stored
            // After all the resursion , arr would become empty and hence result would store
            // result = [[], [], [], [], [], [], [], []]

            result.add((ArrayList<Integer>) arr.clone());
            return;
        }
        // Observe Here -> take or Not Take

        // TAKE
        arr.add(n[ind]);
        getSubsequence(ind+1, arr, n, len, result);
        // Not TAKE
        arr.remove(arr.size()-1);
        getSubsequence(ind+1, arr, n, len, result);
    }

    public static void main(String[] args) {
        int n[] = {1,2,3};
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        getSubsequence(0, new ArrayList<Integer>(), n, n.length, result);
        System.out.println(result);
    }
}

/**
 * Time complextity :- O(N*2powerN)
 * 2powerN for recursion
 * N for cloning
 */

/**
 * Space Complexity O(N)
 * max deppth of recursion tree at any point would be N
 * for auxilery array arr -> N
 * Total Space -> 2N
 */
