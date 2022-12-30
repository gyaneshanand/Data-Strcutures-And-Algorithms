package recursion.subsequences;

import java.util.ArrayList;

public class OneSubsequenceWithSumK {

    static boolean findSubsequenceWithSumK(int index, ArrayList<Integer> seq, int arr[], int cur_sum, int len, int K) {
        if(index==len || cur_sum>=K)
        {
            if(cur_sum==K) {
                System.out.println(seq);
                return true;
            }
            return false;
        }
        seq.add(arr[index]);
        Boolean left = findSubsequenceWithSumK(index+1, seq, arr, cur_sum+arr[index], len, K);
        if(left)
            return true;
        seq.remove(seq.size()-1);
        return findSubsequenceWithSumK(index+1, seq, arr, cur_sum, len, K);
    }

    public static void main(String[] args) {
        int K = 5;
        int arr[] = {1,2,3,4,5};
        findSubsequenceWithSumK(0, new ArrayList<Integer>(), arr, 0, arr.length, K);
    }
}
