package recursion.subsequences;

public class CountNoOfSubsequencesWithSumK {

    static int countSubsequencesWithSumK(int index, int curSum, int arr[], int n, int K) {
        if(index==n)
        {
            if(curSum == K)
                return 1;
            return 0;
        }
        int left = countSubsequencesWithSumK(index+1, curSum+arr[index], arr, n, K);
        int right = countSubsequencesWithSumK(index+1, curSum, arr, n, K);
        return left+right;
    }

    public static void main(String[] args) {
        int K = 3;
        int arr[] = {1,2,1};
        System.out.println(countSubsequencesWithSumK(0, 0, arr, arr.length, K));
    }
}
