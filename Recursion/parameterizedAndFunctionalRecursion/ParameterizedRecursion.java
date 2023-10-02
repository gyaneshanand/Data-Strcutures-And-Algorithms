package Recursion.parameterizedAndFunctionalRecursion;


/**
 * In Parameterized constructor , we paas a parameter in function signature which stores the result.
 */

// Q :- Find sum of number from 1 to N

public class ParameterizedRecursion {

    static void findSum(int i, int s) {
        if(i<1) {
            System.out.println(s);
            return;
        }
        findSum(i-1, s+i);
    }

    public static void main(String[] args) {
        int N = 5;
        findSum(N, 0);
    }
}
