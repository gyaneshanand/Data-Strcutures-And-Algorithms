package recursion.basicRecursion;

public class Print1toNUsingBacktracking {

    static void f(int i, int N) {
        if (i < 1)
            return;
        f(i-1, N);
        System.out.println(i);
    }

    public static void main(String[] args) {
        int N = 5;
        f(N, N);
    }
}
