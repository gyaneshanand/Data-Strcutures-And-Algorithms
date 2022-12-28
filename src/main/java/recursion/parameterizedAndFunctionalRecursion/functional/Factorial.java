package recursion.parameterizedAndFunctionalRecursion.functional;

public class Factorial {

    static long factorial(long n){
        if(n==1)
            return 1;
        return n * factorial(n-1);
    }

    public static void main(String[] args) {
        long N = 5;
        System.out.println(factorial(N));
    }
}
