package recursion.subsequences;

import java.util.ArrayList;

class AllSubsequencesWithSumK {

     static ArrayList<ArrayList<Integer>> result;

     static void findSubsequencesWithSumK(int n, ArrayList<Integer> seq, int arr[], int len, int K) {
        if(n==len) {
            int sum = 0;
            for(int a : seq)
                sum+=a;
            if(sum==K)
                result.add((ArrayList<Integer>) seq.clone());
            return;
        }
        seq.add(arr[n]);
        findSubsequencesWithSumK(n+1, seq, arr, len, K);
        seq.remove(seq.size()-1);
        findSubsequencesWithSumK(n+1, seq, arr, len, K);
    }

    public static void main(String[] args) {
        int K = 5;
        int arr[] = {1,2,3,4,5};
        result = new ArrayList<>();
        findSubsequencesWithSumK(0, new ArrayList<Integer>(), arr, arr.length, K);
        System.out.println(result);
    }
}
