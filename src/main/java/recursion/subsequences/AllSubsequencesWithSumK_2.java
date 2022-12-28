package recursion.subsequences;

import java.util.ArrayList;

class AllSubsequencesWithSumK_2 {

     static ArrayList<ArrayList<Integer>> result;

     static void findSubsequencesWithSumK(int n, ArrayList<Integer> seq, int arr[], int len, int cur_sum, int K) {
        // cur_sum>=K is an optimizations to stop further recursions if cur_sum is already greater than K
         if(n==len || cur_sum>=K) {
            if(cur_sum==K)
                result.add((ArrayList<Integer>) seq.clone());
            return;
        }
        seq.add(arr[n]);
        findSubsequencesWithSumK(n+1, seq, arr, len, cur_sum+arr[n], K);
        seq.remove(seq.size()-1);
        findSubsequencesWithSumK(n+1, seq, arr, len, cur_sum, K);
    }

    public static void main(String[] args) {
        int K = 5;
        int arr[] = {1,2,3,4,5};
        result = new ArrayList<>();
        findSubsequencesWithSumK(0, new ArrayList<Integer>(), arr, arr.length, 0,  K);
        System.out.println(result);
    }
}
