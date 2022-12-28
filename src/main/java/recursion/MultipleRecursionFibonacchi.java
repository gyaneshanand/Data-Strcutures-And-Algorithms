package recursion;


/**
 * Here recursion is called multiple times.
 */

/**
 * Time Complexity :- O(2powerN)
 */

public class MultipleRecursionFibonacchi {

    private static int factorial(int n){
        if(n<=2)
            return 1;
        return factorial(n-1) + factorial(n-2);
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
}
