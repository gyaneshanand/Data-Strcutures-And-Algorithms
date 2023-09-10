package Recursion.parameterizedAndFunctionalRecursion.functional;

public class Factorial {

    static long factorial(long n){
        if(n==1)
            return 1;
        return n * factorial(n-1);
    }

    static void factorial(int n, long fact){
        if(n==1)
            System.out.println(fact);
        factorial(n-1, fact * n);
    }

    public static void main(String[] args) {
        long N = 5;
        System.out.println(factorial(N));

        factorial(5, 1);
    }
}
