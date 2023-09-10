package Recursion.parameterizedAndFunctionalRecursion;

/**
 * In Functional recusrsion , the function itself returns a value
 */

// Q :- Find sum of number from 1 to N


public class FunctionalRecursion {

    static int f(int i){
        if(i == 0)
            return 0;
        return i + f(i-1);
    }

    public static void main(String[] args) {
        int N = 10;
        System.out.println(f(N));
    }
}
